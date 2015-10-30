package com.lukastymo

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
