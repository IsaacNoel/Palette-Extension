enablePlugins(org.nlogo.build.NetLogoExtension)

netLogoExtName      := "palette"

netLogoClassManager := "PaletteExtension"

netLogoTarget :=
  org.nlogo.build.NetLogoExtension.directoryTarget(baseDirectory.value)

netLogoZipSources   := false

javaSource in Compile <<= baseDirectory(_ / "src")

javacOptions ++= Seq("-g", "-Xlint:deprecation", "-Xlint:all", "-Xlint:-serial", "-Xlint:-path",
  "-encoding", "us-ascii")

netLogoVersion := "6.0-M1"

