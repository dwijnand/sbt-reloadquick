package sbtreloadquick

import sbt._, Keys._

object ReloadQuickPlugin extends AutoPlugin {
  override def requires = plugins.CorePlugin
  override def trigger  = allRequirements

  override def buildSettings = super.buildSettings ++ Seq(commands += reloadQuickCommand)

  val reloadQuickCommand = Command.command("reloadQuick") { s =>
    val hashFile = s.baseDir / "project" / "target" / "buildFilesHash"
    val buildFilesHashes = genBuildFilesHashes(Project.structure(s).units)
    val currentBuildFilesHash = buildFilesHashes.##.toString
    val cachedBuildFilesHash = if (hashFile.exists()) IO read hashFile else ""

    s.log.debug(s"cached  build files hash: $cachedBuildFilesHash")
    s.log.debug(s"current build files hash: $currentBuildFilesHash")
    buildFilesHashes foreach { case (file, hash) =>
      s.log.debug(s" file: $file, hash: $hash")
    }

    if (cachedBuildFilesHash == currentBuildFilesHash) s else {
      IO.write(hashFile, currentBuildFilesHash)
      "reload" :: s
    }
  }

  // TODO handle recursion
  def buildFiles(b: File) = (b * "*.sbt") +++ ((b / "project") ** ("*.scala" | "*.sbt")) filter (_.isFile)
  def genBuildFilesHashesAt(base: File) = buildFiles(base).get.iterator.map(f => f -> (Hash toHex Hash(f))).toMap
  def genBuildFilesHashes(units: Map[URI, sbt.internal.LoadedBuildUnit]) =
    (units.values.iterator map (_.localBase) flatMap genBuildFilesHashesAt).toMap
}
