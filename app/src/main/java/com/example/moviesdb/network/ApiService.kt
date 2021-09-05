package com.example.kreaz.network

import NowPlaying
import Popular
import TopRated
import Upcoming
import retrofit2.http.*
const val APIKey = "5daaa7b6b676849c109245963e5be303"
interface ApiService {


    @GET("top_rated")
    suspend fun GetTopRated(
        @Query("api_key") apiKey: String = APIKey,
        @Query("page") page: Int
    ): TopRated?

    @GET("upcoming")
    suspend fun Upcoming(
        @Query("api_key") apiKey: String = APIKey,
        @Query("page") page: Int
    ): Upcoming?


    @GET("popular")
    suspend fun Popular(
        @Query("api_key") apiKey: String = APIKey,

        @Query("page") page: Int
    ): Popular?


    @GET("now_playing")
    suspend fun NowPlaying(
        @Query("api_key") apiKey: String = APIKey,

        @Query("page") page: Int
    ): NowPlaying?





}