scalaVersion := "2.9.2"

scalaSource in Compile <<= baseDirectory(_ / "src")

scalacOptions ++= Seq("-deprecation", "-unchecked", "-Xfatal-warnings",
                      "-encoding", "us-ascii")

libraryDependencies +=
  "org.nlogo" % "NetLogo" % "5.0.1" from
    "http://ccl.northwestern.edu/netlogo/5.0.1/NetLogo.jar"

artifactName := { (_, _, _) => "palette.jar" }

packageOptions := Seq(
  Package.ManifestAttributes(
    ("Extension-Name", "palette"),
    ("Class-Manager", "PaletteExtension"),
    ("NetLogo-Extension-API-Version", "5.0")))

packageBin in Compile <<= (packageBin in Compile, baseDirectory, streams) map {
  (jar, base, s) =>
    IO.copyFile(jar, base / "palette.jar")
    Process("pack200 --modification-time=latest --effort=9 --strip-debug " +
            "--no-keep-file-order --unknown-attribute=strip " +
            "palette.jar.pack.gz palette.jar").!!
    if(Process("git diff --quiet --exit-code HEAD").! == 0) {
      Process("git archive -o palette.zip --prefix=palette/ HEAD").!!
      IO.createDirectory(base / "palette")
      IO.copyFile(base / "palette.jar", base / "palette" / "palette.jar")
      IO.copyFile(base / "palette.jar.pack.gz", base / "palette" / "palette.jar.pack.gz")
      Process("zip palette.zip palette/palette.jar palette/palette.jar.pack.gz").!!
      IO.delete(base / "palette")
    }
    else {
      s.log.warn("working tree not clean; no zip archive made")
      IO.delete(base / "palette.zip")
    }
    jar
  }

cleanFiles <++= baseDirectory { base =>
  Seq(base / "palette.jar",
      base / "palette.jar.pack.gz",
      base / "palette.zip") }

