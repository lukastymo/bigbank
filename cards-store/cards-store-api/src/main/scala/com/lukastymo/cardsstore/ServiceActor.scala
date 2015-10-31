package com.lukastymo.cardsstore

import akka.actor.{Actor, Props}

import scala.concurrent.ExecutionContext

class ServiceActor extends Actor with Operations {
  implicit val executionContext: ExecutionContext = ExecutionContext.Implicits.global

  def actorRefFactory = context

  def receive = runRoute(routes)

}

object ServiceActor {
  def props = Props[ServiceActor]
}