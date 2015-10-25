import sbt._
import sbt.Keys._


object Common {



  lazy val commonResolvers = Seq(
    "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
  )

  lazy val commonSettings = Seq(
    version := scala.util.Properties.envOrElse("RDBIG_VERSION_OVERRIDE", "1.0.0-SNAPSHOT"),
    scalaVersion := "2.10.5",
    organization := "com.rdbig",
    scalacOptions := Seq("-unchecked", "-deprecation", "encoding", "utf-8", "feature"),
    resolvers := commonResolvers
  )

  def excludeSl4j(module:ModuleID):ModuleID = {
        module.excludeAll(ExclusionRule("org.sl4j"))
  }

}
