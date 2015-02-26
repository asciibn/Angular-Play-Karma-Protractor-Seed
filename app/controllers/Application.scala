package controllers

import play.api.mvc.{Action, Controller}

object Application extends Controller {
  def index = Action {
    Ok(views.html.index.render("Hello Play Framework"))
  }


  def user(userName: String) = Action{
    import play.api.libs.json.Json
    val nieces = Seq(userName)
    Ok(Json.toJson(nieces))
  }

  def helloWorld() = Action{
    import play.api.libs.json.Json
    val nieces = Seq("Aleka", "Christina", "Emily", "Hannah", "Molly")
    Ok(Json.toJson(nieces))
    //Ok(views.html.index.render("_hello world"))
  }
}