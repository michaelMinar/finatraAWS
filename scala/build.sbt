organization := "com.falstaff"

scalaVersion := "2.10.4"

resolvers ++= Seq(
    "twttr" at "http://maven.twttr.com/")

libraryDependencies ++= Seq(
    "com.twitter" %% "finagle-http" % "6.24.0"
)