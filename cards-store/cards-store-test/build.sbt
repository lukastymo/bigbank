enablePlugins(GatlingPlugin)

name := "cards-store-test"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.1.7" % "it",
  "io.gatling"            % "gatling-test-framework"    % "2.1.7" % "it"
)


