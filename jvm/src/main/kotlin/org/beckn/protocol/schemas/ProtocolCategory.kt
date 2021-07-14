package org.beckn.protocol.schemas

import java.time.LocalDateTime

data class ProtocolCategory @Default constructor(
    val id: String,
    val parentCategoryId: String? = null,
    val descriptor: ProtocolDescriptor,
    val time: LocalDateTime? = null,
    val tags: Map<String, String>? = null
)