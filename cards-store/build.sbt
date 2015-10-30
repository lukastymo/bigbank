name := "cards-store"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

lazy val commonSettings = Seq(
  organization := "lukastymo.bigbank.cardsstore",
  version := "1.0.0"
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