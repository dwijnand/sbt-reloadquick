val sbtreloadquick = project in file(".") settings (name := "sbt-reloadquick")

ThisBuild / organization := "com.dwijnand"
ThisBuild / licenses     := Seq("Apache-2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0"))
ThisBuild / description  := "An sbt plugin to cache 'reload' to make it quick"
ThisBuild / developers   := List(Developer("dwijnand", "Dale Wijnand", "dale wijnand gmail com", url("https://dwijnand.com")))
ThisBuild / startYear    := Some(2018)
ThisBuild / homepage     := scmInfo.value map (_.browseUrl)
ThisBuild / scmInfo      := Some(ScmInfo(url("https://github.com/dwijnand/sbt-reloadquick"), "scm:git:git@github.com:dwijnand/sbt-reloadquick.git"))

         sbtPlugin   := true
Global / sbtVersion  := "1.0.0" // must be Global, otherwise ^^ won't change anything
    crossSbtVersions := List("1.0.0")

ThisBuild / scalaVersion := "2.12.15"

       maxErrors := 15
triggeredMessage := Watched.clearWhenTriggered

scalacOptions ++= Seq("-encoding", "utf8")
scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Xlint")
scalacOptions  += "-Xfuture"
scalacOptions  += "-Yno-adapted-args"
scalacOptions  += "-Ywarn-dead-code"
scalacOptions  += "-Ywarn-numeric-widen"
scalacOptions  += "-Ywarn-value-discard"

// scriptedLaunchOpts ++= Seq("-Dplugin.version=" + version.value)
// scriptedBufferLog := true

def toSbtPlugin(m: ModuleID) = Def.setting(
  Defaults.sbtPluginExtra(m, (pluginCrossBuild / sbtBinaryVersion).value, (update / scalaBinaryVersion).value)
)

mimaPreviousArtifacts := Set(toSbtPlugin("com.dwijnand" % "sbt-reloadquick" % "1.0.0").value)

import com.typesafe.tools.mima.core._, ProblemFilters._
mimaBinaryIssueFilters ++= Seq()

Global / cancelable := true
