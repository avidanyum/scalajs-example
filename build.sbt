import com.lihaoyi.workbench.Plugin._

enablePlugins(ScalaJSPlugin)

workbenchSettings

name := "Example"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.8.0",
  "com.lihaoyi" %%% "scalatags" % "0.5.4"
)

skip in packageJSDependencies := false

jsDependencies += "org.webjars" % "d3js" % "3.5.12" / "d3.js"

jsDependencies += "org.webjars" % "requirejs" % "2.1.22" / "require.js"

jsDependencies += ProvidedJS / "d3-funnel.js"

bootSnippet := "example.ScalaJSExample().main(document.getElementById('canvas'));"

updateBrowsers <<= updateBrowsers.triggeredBy(fastOptJS in Compile)

