package org.beckn.protocol.schemas

interface ProtocolRequest {
  val context: ProtocolContext
}

data class ProtocolSearchRequest @Default constructor(
  override val context: ProtocolContext,
  val message: ProtocolSearchRequestMessage
) : ProtocolRequest

data class ProtocolSearchRequestMessage @Default constructor(
  val intent: ProtocolIntent
)

data class ProtocolSelectRequest @Default constructor(
  override val context: ProtocolContext,
  val message: ProtocolSelectRequestMessage
) : ProtocolRequest

data class ProtocolSelectRequestMessage @Default constructor(
  val selected: ProtocolSelectMessageSelected
)

data class ProtocolInitRequest @Default constructor(
  override val context: ProtocolContext,
  val message: ProtocolInitRequestMessage
) : ProtocolRequest

data class ProtocolInitRequestMessage @Default constructor(
  val order: ProtocolOrder
)

data class ProtocolConfirmRequest @Default constructor(
  override val context: ProtocolContext,
  val message: ProtocolConfirmRequestMessage
) : ProtocolRequest

data class ProtocolConfirmRequestMessage @Default constructor(
  val order: ProtocolOrder
)

data class ProtocolTrackRequest @Default constructor(
  override val context: ProtocolContext,
  val message: ProtocolTrackRequestMessage
) : ProtocolRequest

data class ProtocolTrackRequestMessage @Default constructor(
  val orderId: String,
  val callbackUrl: String? = null,
)
