import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

  val appName = "Svenska Bitcoin"
  val appVersion = "1.0.2"
  val retrievedManaged = true

  val appDependencies = Seq(
    // Add your project dependencies here,
    "org.bitcex" %% "bitcex-core" % "1.0.0-SNAPSHOT"
  )

  //  val bitcex = Project("bitcex", file("../bitcex"))


  val main = PlayProject(appName, appVersion, appDependencies).settings(defaultScalaSettings: _*).settings(
    // Add your own project settings here
   // resolvers += Resolver.file("local Ivy2", file(Path.userHome.absolutePath+"/.ivy2/local"))(Resolver.ivyStylePatterns) //transactional()
    resolvers ++= Seq (
         Resolver.file("Local Ivy2", file(Path.userHome.absolutePath+"/.ivy2/local"))(Resolver.ivyStylePatterns), //transactional(),
          "Local Maven" at "file://"+Path.userHome.absolutePath+"/.m2/repository",
          "Saxon" at "http://www.eviware.com/repository/maven2",
         "Restlet" at "http://maven.restlet.org"
      )

  )

}
