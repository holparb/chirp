package com.holparb.chirp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform