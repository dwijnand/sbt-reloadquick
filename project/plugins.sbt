// unmanagedSourceDirectories in Compile += baseDirectory.value / "../src/main/scala"

          addSbtPlugin("com.dwijnand"      % "sbt-dynver"      % "4.1.1")
// libraryDependencies += "org.scala-sbt"     % "scripted-plugin" % sbtVersion.value
          addSbtPlugin("com.typesafe"      % "sbt-mima-plugin" % "0.9.2")
          addSbtPlugin("org.foundweekends" % "sbt-bintray"     % "0.6.1")
