name := "spark-example"

version := "1.0"

scalaVersion := "2.12.10"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.4.5",
  "org.scalatest" %% "scalatest" % "3.1.1" % "test"
)

mainClass in (Compile, run) := Some("com.example.Main")

test in assembly := {}

assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)
