ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "live-stock-websocket"
  )

libraryDependencies ++= {
  val typesafeConfigV = "1.4.2"
  val scalaLoggingV = "3.9.2"
  val logbackV = "1.2.3"
  val scalaTestV = "3.0.8"
  val mockitoV = "3.4.6"
  val jettyVersion = "9.4.27.v20200227"
  val redisScalaV = "1.9.0"
  Seq(
    "com.typesafe" % "config" % typesafeConfigV,
    "com.typesafe.scala-logging" %% "scala-logging" % scalaLoggingV,
    "ch.qos.logback" % "logback-classic" % logbackV,
    "org.eclipse.jetty.websocket" % "websocket-api" % jettyVersion,
    "org.eclipse.jetty.websocket" % "websocket-server" % jettyVersion,
    "org.eclipse.jetty.websocket" % "websocket-client" % jettyVersion,
    "com.github.etaty" %% "rediscala" % redisScalaV,
    "org.mockito" % "mockito-core" % mockitoV % Test,
    "org.scalatest" %% "scalatest" % scalaTestV % Test
  )
}