package com.skyehub.newsfeeds.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private const val BASE_URL = "https://jsonplaceholder.typicode.com"

    fun getInstance(): Retrofit {
        //Enable request and response logging
//        val client = OkHttpClient()
//        val interceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
//        val clientBuilder: OkHttpClient.Builder =
//            client.newBuilder().addInterceptor(interceptor)

        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}
