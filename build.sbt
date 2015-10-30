lazy val commonSettings = Seq(
	organization := "lukastymo.bigbank",
	version := "1.0.0"
)

lazy val bigbank = project.in(file("."))
	.aggregate(
		`cards-store`
	)
	.settings(commonSettings: _*)

lazy val `cards-store` = project.settings(commonSettings: _*)