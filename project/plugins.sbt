// unmanagedSourceDirectories in Compile += baseDirectory.value / "../src/main/scala"

          addSbtPlugin("com.github.sbt"      % "sbt-dynver"      % "5.0.1")
// libraryDependencies += "org.scala-sbt"     % "scripted-plugin" % sbtVersion.value
          addSbtPlugin("com.typesafe"      % "sbt-mima-plugin" % "1.1.0")
          addSbtPlugin("org.foundweekends" % "sbt-bintray"     % "0.6.1")
