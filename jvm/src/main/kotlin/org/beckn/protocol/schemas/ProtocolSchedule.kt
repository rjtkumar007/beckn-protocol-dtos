package org.beckn.protocol.schemas

data class ProtocolSchedule @Default constructor(
  val frequency: String? = null,
  val holidays: String? = null,
  val times: java.time.OffsetDateTime? = null
)