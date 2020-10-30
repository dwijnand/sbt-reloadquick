// unmanagedSourceDirectories in Compile += baseDirectory.value / "../src/main/scala"

          addSbtPlugin("com.dwijnand"      % "sbt-dynver"      % "4.1.1")
          addSbtPlugin("io.get-coursier"   % "sbt-coursier"    % "2.0.2")
// libraryDependencies += "org.scala-sbt"     % "scripted-plugin" % sbtVersion.value
          addSbtPlugin("com.typesafe"      % "sbt-mima-plugin" % "0.8.1")
          addSbtPlugin("org.foundweekends" % "sbt-bintray"     % "0.6.0")
