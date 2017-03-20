enablePlugins(ScalaJSPlugin)
enablePlugins(ScalaJSBundlerPlugin)

organization := "com.turbolent"
name := "collection-view-scalajs"
version := "1.0-SNAPSHOT"

scalaVersion := "2.11.8"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"

jsDependencies += RuntimeDOM

publishMavenStyle := true

publishTo := {
  val repositoryPath = System.getProperty("repositoryPath")
  if (repositoryPath == null) None
  else Some("internal.repo" at file(repositoryPath).toURI.toURL.toString)
}

npmDependencies in Compile += "collection-view" -> "0.1.9"
