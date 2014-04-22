sbtPlugin := true

name := "bom"

organization := "com.github.baleio.sbt.bom"

organizationName := "Baleio Inc."

organizationHomepage := Some(url("http://www.bale.io"))

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.10.4"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

resolvers ++= Seq(
  "Baleio Mirror" at "http://nexus.baleio.com/content/groups/public",
  "Baleio Releases" at "http://nexus.baleio.com/content/repositories/baleio-releases",
  "Baleio 3rd Party" at "http://nexus.baleio.com/content/repositories/baleio-thirdparty",
  "Baleio Snapshots" at "http://nexus.baleio.com/content/repositories/baleio-snapshots"
)

publishMavenStyle := true

publishTo <<= version { (v: String) =>
  val nexus = "http://nexus.bale.io/"
  if (v.trim.endsWith("SNAPSHOT"))
    Some("Baleio Snapshots" at nexus + "content/repositories/baleio-snapshots")
  else
    Some("Baleio Releases"  at nexus + "content/repositories/baleio-releases")
}

credentials += Credentials(Path.userHome / ".ivy2" / ".auth-baleio")
