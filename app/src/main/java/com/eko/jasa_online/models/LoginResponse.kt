package com.eko.jasa_online.models

data class LoginResponse (
    val message: String,
    val error: Boolean,
    val data: User
)