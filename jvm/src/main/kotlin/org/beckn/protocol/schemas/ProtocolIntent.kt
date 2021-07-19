package org.beckn.protocol.schemas

data class ProtocolIntent(
    val queryString: String?,
    val fulfillment: ProtocolFulfillment?,
    val item: ProtocolIntentItem? = null,
    val provider: ProtocolProvider?
)

data class ProtocolIntentItem(
    val id: String? = null,
    val descriptor: ProtocolIntentItemDescriptor? = null
)

data class ProtocolIntentItemDescriptor(
    val name: String? = null,
    val tags: Map<String, String>? = null
)