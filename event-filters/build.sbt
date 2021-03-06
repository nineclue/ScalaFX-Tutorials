name := "Event Filters"

version := "1.0.1"

scalaVersion := "2.10.3"

// Add managed dependency on ScalaFX library
libraryDependencies += "org.scalafx" %% "scalafx" % "1.0.0-M7"

// Add unmanaged dependency on JavaFX library based on JAVA_HOME variable
unmanagedJars in Compile += Attributed.blank(file(System.getenv("JAVA_HOME") + "/jre/lib/jfxrt.jar"))

// Fork a new JVM for 'run' and 'test:run'
fork := true