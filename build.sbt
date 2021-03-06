name := "bitcoin-scodec"

organization := "io.github.yzernik"

version := "0.2.9-hc-3"

scalaVersion := "2.12.3"

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

resolvers += "Sonatype Public" at "https://oss.sonatype.org/content/groups/public/"

resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"

libraryDependencies ++= Seq(
  "org.scodec"                    %% "scodec-core"    % "1.10.3",
  "org.scalatest"                 %% "scalatest"      % "3.0.3"  % "test",
  "org.scalacheck"                %% "scalacheck"     % "1.13.4" % "test"
)

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")
