name := "DateTimeFormatInterpolator - Java7"

version := "0.1.0"

scalacOptions += "-target:jvm-1.7"

crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.2")

libraryDependencies += "com.propensive" %% "contextual" % "1.0.0"

libraryDependencies += "org.threeten" % "threetenbp" % "1.3.3"

unmanagedSourceDirectories in Compile += baseDirectory.value / ".." / "src-common/main/scala"
