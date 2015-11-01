lazy val commonSettings = Seq(
	organization := "lukastymo.bigbank",
	version := "1.0.0",
  scalaVersion := "2.11.7"
)

lazy val bigbank = project.in(file("."))
	.aggregate(
		`cards-store`
	)
	.settings(commonSettings: _*)

lazy val `cards-store` = project.settings(commonSettings: _*)
