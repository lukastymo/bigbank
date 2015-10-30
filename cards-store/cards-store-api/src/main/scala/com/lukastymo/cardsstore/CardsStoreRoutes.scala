package com.lukastymo.cardsstore

import spray.routing.HttpService

trait CardsStoreRoutes extends HttpService {
  val ping =
    path("cardsstore" / "ping") {
      get {
        complete {
          "OK"
        }
      }
    }
}
