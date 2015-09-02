scalaVersion := "2.11.7"

enablePlugins(org.nlogo.build.NetLogoExtension)

scalaSource in Compile <<= baseDirectory(_ / "src")

scalacOptions ++= Seq("-deprecation", "-unchecked", "-Xfatal-warnings", "-encoding", "us-ascii")

javacOptions ++= Seq("-Xlint:deprecation")

netLogoExtName      := "palette"

netLogoClassManager := "PaletteExtension"

netLogoZipSources   := false

val netLogoJarOrDependency =
  Option(System.getProperty("netlogo.jar.url"))
    .orElse(Some("http://ccl.northwestern.edu/netlogo/5.3.0/NetLogo.jar"))
    .map { url =>
      import java.io.File
      import java.net.URI
      if (url.startsWith("file:"))
        (Seq(new File(new URI(url))), Seq())
      else
        (Seq(), Seq("org.nlogo" % "NetLogo" % "5.3.0" from url))
    }.get

unmanagedJars in Compile ++= netLogoJarOrDependency._1

libraryDependencies      ++= netLogoJarOrDependency._2

packageBin in Compile := {
  val jar = (packageBin in Compile).value
  val paletteZip = baseDirectory.value / "palette.zip"
  if (paletteZip.exists) {
    IO.unzip(paletteZip, baseDirectory.value)
    for (jar <- (baseDirectory.value / "palette" ** "*.jar").get)
      IO.copyFile(jar, baseDirectory.value / jar.getName)
    IO.delete(baseDirectory.value / "palette")
  }
  jar
}
