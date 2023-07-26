package com.example.beerapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform