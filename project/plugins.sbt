addSbtPlugin("com.github.gseitz" % "sbt-release"  % "1.0.11")
addSbtPlugin("org.xerial.sbt"    % "sbt-sonatype" % "3.6")
addSbtPlugin("com.jsuereth"      % "sbt-pgp"      % "2.0.0-M2")
addSbtPlugin("org.scalameta"     % "sbt-scalafmt" % "2.0.4")

libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value

resolvers += Resolver.sonatypeRepo("releases")
