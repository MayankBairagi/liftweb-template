//plugins
resolvers += Classpaths.typesafeResolver

resolvers += "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"

//web container
libraryDependencies <+= sbtVersion(v => v match {
case "0.11.2" => "com.github.siasia" %% "xsbt-web-plugin" % "0.11.2-0.2.11"
case "0.11.3" => "com.github.siasia" %% "xsbt-web-plugin" % "0.11.3-0.2.11.1"
})

//eclipse
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.0.0")

//idea
addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.0.0")

//sbt-jrebel
//resolvers += "Jawsy.fi M2 releases" at "http://oss.jawsy.fi/maven2/releases"

//addSbtPlugin("fi.jawsy.sbtplugins" %% "sbt-jrebel-plugin" % "0.9.0")