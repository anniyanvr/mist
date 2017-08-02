package io.hydrosphere.mist.apiv2

import io.hydrosphere.mist.api.SetupConfiguration

case class JobContext(
  setupConfiguration: SetupConfiguration,
  params: Map[String, Any]
)
