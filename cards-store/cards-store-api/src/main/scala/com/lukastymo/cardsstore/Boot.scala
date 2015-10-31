package com.lukastymo.cardsstore

import akka.actor.ActorSystem
import akka.io.IO
import akka.pattern.ask
import akka.util.Timeout
import spray.can.Http

import scala.concurrent.duration._

object Boot extends App {
  implicit val system = ActorSystem("cards-store-api")

  val service = system.actorOf(ServiceActor.props, "cards-store")

  implicit val timeout = Timeout(5.seconds)
  IO(Http) ? Http.Bind(service, interface = "localhost", port = 8081)
}
