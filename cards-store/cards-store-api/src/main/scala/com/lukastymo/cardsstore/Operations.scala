package com.lukastymo.cardsstore

import spray.routing.{RequestContext, Route}

import scala.concurrent.Future

trait Operations extends Routes {
  def getPing: Future[String] = Future {
    "OK"
  }
}
