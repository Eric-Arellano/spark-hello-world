organization := "com.ericarellano"
name := "SparkHelloWorld"
version := "0.1.0-SNAPSHOT"
scalaVersion := "2.11.11"

val sparkVersion = "2.2.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion
)

