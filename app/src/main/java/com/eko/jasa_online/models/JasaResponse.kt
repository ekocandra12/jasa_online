package com.eko.jasa_online.models

data class JasaResponse (
    val message: String,
    val error: Boolean,
    val datas: List<Jasa>
)
