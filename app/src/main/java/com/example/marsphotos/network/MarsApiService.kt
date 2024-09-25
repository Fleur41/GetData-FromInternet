package com.example.marsphotos.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL =
    "https://android-kotlin-fun-mars-server.appspot.com"
private val retrofit = Retrofit.Builder()
    .baseUrl(BASE_URL)
    .addConverterFactory(ScalarsConverterFactory.create())
    .build()

interface MarsApiService {
    @GET("photos")
    fun getPhotos() : String
}

object MarsApi{
   val retrofitService : MarsApiService by lazy {
       retrofit.create(MarsApiService::class.java)
   }
}