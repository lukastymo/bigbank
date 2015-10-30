name := "cards-store"

val scalaVer = "2.11.7"

lazy val commonDependency = Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test"
)

lazy val commonSettings = Seq(
  organization := "lukastymo.bigbank.cardsstore",
  version := "1.0.0",
  scalaVersion := scalaVer,
  libraryDependencies ++= commonDependency
)

lazy val `cards-store` = project.in(file("."))
  .aggregate(
    `cards-store-api`,
    `cards-store-business`,
    `cards-store-int`
  )
  .settings(commonSettings: _*)

lazy val `cards-store-api` = project.settings(commonSettings: _*)
lazy val `cards-store-business` = project.settings(commonSettings: _*)
lazy val `cards-store-int` = project.settings(commonSettings: _*)