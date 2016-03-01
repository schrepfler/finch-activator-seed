name := """finch-seed"""

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.7"

mainClass in (Compile, run) := Some("Main")

libraryDependencies ++= Seq(
	  "com.github.finagle" %% "finch-core" % "0.10.0"
)

resolvers ++= Seq(
	 Resolver.sonatypeRepo("snapshots")
)
