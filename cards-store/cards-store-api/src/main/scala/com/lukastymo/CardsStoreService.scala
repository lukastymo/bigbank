package com.lukastymo

import akka.actor.{Props, Actor}

class CardsStoreService extends Actor with CardsStoreRoutes {
  private val routes = {
    ping
  }

  def actorRefFactory = context

  def receive = runRoute(routes)
}

object CardsStoreService {
  def props = Props[CardsStoreService]
}