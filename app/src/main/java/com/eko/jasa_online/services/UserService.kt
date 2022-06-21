package com.eko.jasa_online.services


import com.eko.jasa_online.models.LoginResponse
import retrofit2.Call
import retrofit2.http.*
interface UserService {
    @GET("login")
    fun loginUser(
        @QueryMap filter: HashMap<String, String>
    ): Call<LoginResponse>
}
