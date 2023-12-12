package io.ceratech.fcm

import sttp.client4.Backend
import sttp.client4.pekkohttp.PekkoHttpBackend

import scala.concurrent.Future

/**
  * Provides the FCM config to use when sending notifications
  *
  * @author dries
  */
trait FcmConfigProvider {

  /**
    * @return the FCM condig to use
    */
  val config: FcmConfig

  /**
    * @return the STTP backend to use needs to be an async backend; defaults to an [[org.asynchttpclient.AsyncHttpClient]] based backend
    */
  def constructBackend: Backend[Future] = PekkoHttpBackend()
}
