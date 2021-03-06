name := "ScalaJS"

version := "0.1"

ThisBuild / scalaVersion := "2.13.6"

lazy val root = Project("scalajs", file("."))
  .aggregate(scalajsofficialtutorial, handsonscalajstutorial)

lazy val scalajsofficialtutorial = project
  .in(file("ScalaJSOfficialTutorial"))
  .enablePlugins(ScalaJSPlugin)

lazy val handsonscalajstutorial = project
  .in(file("HandsOnScalaJSTutorial"))
  .enablePlugins(ScalaJSPlugin)
