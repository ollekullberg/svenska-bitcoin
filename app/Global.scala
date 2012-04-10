import models._
import play.api.{Logger, Application, GlobalSettings}

object Global extends GlobalSettings {

  override def onStart(app: Application) {
    try {
      //Todo remove hard coding
      PlayActorService.create(Name("Martin Zachrison"), Email("zac@cyberzac.se"), "secret")
      PlayActorService.create(Name("Mats Henricson"), Email("mats@henricson.se"), "secret")
      PlayActorService.create(Name("Jarl Fransson"), Email("jarl@acm.org"), "secret")
      PlayActorService.create(Name("Olle Kullberg"), Email("olle.kullberg@gmail.com"), "secret")
    } catch {
      case iea: IllegalArgumentException => Logger.info("Ignoring setup errors" + iea.getMessage)
    }
  }
}