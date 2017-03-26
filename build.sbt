import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "pl.algocreations",
      scalaVersion := "2.12.1",
      version      := "0.0.1-SNAPSHOT"
    )),
    name := "FSTree",
    libraryDependencies += scalaTest % Test
  )
