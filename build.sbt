ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.3"

lazy val root = (project in file("."))
  .settings(
    name := "learning-scala",
    idePackagePrefix := Some("com.akarsh.learning")
  )

libraryDependencies += "com.lihaoyi" %% "fansi" % "0.5.0"
libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test