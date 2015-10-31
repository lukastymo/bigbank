package com.lukastymo.cardsstore

import spray.routing.HttpService

import scala.concurrent.{ExecutionContext, Future}

trait Routes extends HttpService {
  implicit val executionContext: ExecutionContext

  lazy val routes = ping

  private val ping =
    path("cardsstore" / "ping") {
      get {
        complete {
          getPing
        }
      }
    }

  def getPing: Future[String]
}
