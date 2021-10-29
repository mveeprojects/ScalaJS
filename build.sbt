name := "ScalaJS"

version := "0.1"

scalaVersion := "2.13.6"

enablePlugins(ScalaJSPlugin)

scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.1.0"
// libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.0.0"
