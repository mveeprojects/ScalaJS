scalaJSUseMainModuleInitializer := true

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "2.0.0",
  "org.akka-js"  %%% "shocon"      % "1.0.0"
)

enablePlugins(ShoconPlugin)

Compile / compile := (Compile / compile).dependsOn(shoconConcat).value

