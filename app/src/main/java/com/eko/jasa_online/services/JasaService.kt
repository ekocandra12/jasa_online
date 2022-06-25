package com.eko.jasa_online.services


import com.eko.jasa_online.models.JasaResponse
import retrofit2.Call
import retrofit2.http.GET
interface JasaService {
    @GET("services")
    fun getJasa() : Call<JasaResponse>
}