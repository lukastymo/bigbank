package com.lukastymo.cardsstore

import akka.actor.{Actor, Props}

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