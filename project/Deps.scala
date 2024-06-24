import sbt._
import Keys._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

object Deps {
  // hack to expand %%% in settings, needs .value in build.sbt
  import Def.{setting => dep}

  val scalaTest = dep("org.scalatest" %%% "scalatest" % "3.2.19")

  val boopickle = dep("io.suzaku" %%% "boopickle" % "1.4.0")

  val cats = dep("org.typelevel" %%% "cats-core" % "2.12.0")

  val scalapb = dep("com.thesamet.scalapb" %%% "scalapb-runtime" % "0.11.17")

  val circe = new {
    private val version = "0.14.1"
    val core = dep("io.circe" %%% "circe-core" % version)
    val parser = dep("io.circe" %%% "circe-parser" % version)
  }
  val scodec = new {
    val core = dep("org.scodec" %%% "scodec-core" % "1.11.10")
    val core2 = dep("org.scodec" %%% "scodec-core" % "2.3.0")
    val bits = dep("org.scodec" %%% "scodec-bits" % "1.1.38")
  }
  val upickle = dep("com.lihaoyi" %%% "upickle" % "3.3.1")
  val jsoniter = dep("com.github.plokhotnyuk.jsoniter-scala" %%% "jsoniter-scala-core" % "2.30.1")
  val zioJson = dep("dev.zio" %%% "zio-json" % "0.7.0")

  val http4s = dep("org.http4s" %%% "http4s-core" % "0.23.27")
}
