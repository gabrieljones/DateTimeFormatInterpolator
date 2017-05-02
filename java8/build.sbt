name := "DateTimeFormatInterpolator - Java8"

version := "0.1.0"

//scalacOptions += "-target:jvm-1.8"

crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.2")

libraryDependencies += "com.propensive" %% "contextual" % "1.0.0"

unmanagedSourceDirectories in Compile += baseDirectory.value / ".." / "src-common/main/scala"

