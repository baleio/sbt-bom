sbtPlugin := true

name := "bom"

organization := "com.github.baleio.sbt.bom"

organizationName := "Baleio Inc."

organizationHomepage := Some(url("http://www.bale.io"))

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.10.4"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

val mirror = "Mirror" at "http://nexus.baleio.com/content/groups/public"
val releases = "Releases" at "http://nexus.baleio.com/content/repositories/baleio-releases"
val thirdParty = "3rd Party" at "http://nexus.baleio.com/content/repositories/baleio-thirdparty"
val snapshots = "Snapshots" at "http://nexus.baleio.com/content/repositories/baleio-snapshots"

resolvers ++= Seq(mirror, releases, thirdParty, snapshots)

//libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.0.1"

publishMavenStyle := true

publishTo <<= version { (v: String) =>
  if (v.trim.endsWith("SNAPSHOT"))
    Some(snapshots)
  else
    Some(releases)
}

credentials += Credentials(Path.userHome / ".sbt" / ".auth-baleio")
