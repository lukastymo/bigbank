package com.lukastymo.cardsstore

import scala.concurrent.Future

trait Operations extends Routes {
  def getPing: Future[String] = Future {
    "OK"
  }
}
