import Dependencies._

//enablePlugins(GitVersioning)

githubOwner := "jondlew"
githubRepository := "fcm-scala"
githubTokenSource := TokenSource.GitConfig("github.token")


lazy val root = (project in file(".")).
  settings(

    inThisBuild(List(
      version := "1.0.1",
      organization := "com.newwavecoding",
      organizationName := "newwavecoding",
      organizationHomepage := Some(url("https://ceratech.io/")),
      homepage := Some(url("https://github.com/scalameta/sbt-scalafmt")),
      description := "FCM (Firebase Cloud Messaging) client for Scala.",
      licenses := List("Apache-2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0")),
      scmInfo := Some(
        ScmInfo(
          url("https://github.com/Ceratech/fcm-scala"),
          "scm:git@github.com:Ceratech/fcm-scala.git"
        )
      ),
      developers := List(
        Developer(
          id = "DriesSchulten",
          name = "Dries Schulten",
          email = "dries@ceratech.io",
          url = url("https://ceratech.io/")
        )
      ),
      scalaVersion := "2.13.13",
      crossScalaVersions := Seq("2.13.13", "2.12.15")
    )),

    autoScalaLibrary := true,

    name := "fcm-scala",
    publishMavenStyle := true,


    libraryDependencies ++= sttp,
    libraryDependencies ++= circe,
    libraryDependencies ++= Seq(
      ficus,
      scalaLogging,
      javaxInject,

      scalaTest % Test,
      scalaMock % Test,
      logback % Test
    )
  )
