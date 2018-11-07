package com.spreys.contactmanager

import retrofit2.Call
import retrofit2.http.GET

interface PokemanService {
    @GET("pokemon")
    fun get(): Call<PokemanList>
}