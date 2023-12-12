import sbt._

object Dependencies {
  private val circeVersion = "0.14.6"
  private val sttpVersion = "4.0.0-M8"
  private val retryVersion = "0.3.6"
  private val jwtVersion = "9.4.5"

  lazy val sttp = Seq(
    "com.softwaremill.sttp.client4" %% "core" % sttpVersion,
    "com.softwaremill.sttp.client4" %% "circe" % sttpVersion,
    "com.softwaremill.sttp.client4" %% "pekko-http-backend" % sttpVersion,
    "com.softwaremill.retry" %% "retry" % retryVersion,
    "com.github.jwt-scala" %% "jwt-circe" %  jwtVersion
  )

  lazy val circe = Seq(
    "io.circe" %% "circe-core" % circeVersion,
    "io.circe" %% "circe-parser" % circeVersion,
    "io.circe" %% "circe-generic" % circeVersion
  )

  lazy val javaxInject = "javax.inject" % "javax.inject" % "1"
  lazy val ficus = "com.iheart" %% "ficus" % "1.5.2"
  lazy val scalaLogging = "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"

  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.15"
  lazy val scalaMock = "org.scalamock" %% "scalamock" % "5.2.0"
  lazy val logback = "ch.qos.logback" % "logback-classic" % "1.4.7"
}
