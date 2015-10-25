import sbt._
import sbt.Keys._

object RdBigBuild extends Build {

  import Common._

  lazy val root = Project(
    id = "RdBig",
    base = file(".")
  ) .settings(commonSettings)
  .aggregate(gateway)

  lazy val gateway = Project(
  id="rdbig-gateway",
  base=file("./rdbig-gateway")
  ).settings(commonSettings)

  lazy val app = Project(
  id="rdbig-kafka",
  base= file("./rdbig-kafka")
  ).settings(commonSettings)


}