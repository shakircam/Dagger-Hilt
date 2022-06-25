package com.example.daggerhilt.data.remote

import retrofit2.http.GET

interface FakeApi {

    @GET("login")
    fun userLogin()
}