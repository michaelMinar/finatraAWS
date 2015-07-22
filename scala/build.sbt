organization := "com.falstaff"

scalaVersion := "2.11.6"

resolvers += "twitter-repo" at "http://maven.twttr.com"

libraryDependencies ++= Seq(
  "com.twitter" %% "finagle-httpx" % "6.26.0",
  "com.github.seratch" %% "awscala" % "0.5.+"
)