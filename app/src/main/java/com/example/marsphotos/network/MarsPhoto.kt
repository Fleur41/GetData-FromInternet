package com.example.marsphotos.network

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName(value = "img_src")
data class MarsPhoto(
    val id: String,
    val imgSrc: String
)