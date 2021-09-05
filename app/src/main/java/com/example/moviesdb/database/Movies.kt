package com.example.moviesdb.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.NumberFormat

@Entity
data class Movies(
    @PrimaryKey()
    val id: Int = 0,

    @ColumnInfo(name = "title")
    val Title: String ,

    @ColumnInfo(name = "backdrop_path")
    val backdropPath: String ,

    @ColumnInfo(name = "overview")
    val overview: String,

    @ColumnInfo(name = "poster_path")
    val Poster: String,

    @ColumnInfo(name = "release_date")
    val releaseDate: String = "already out",

    @ColumnInfo(name = "vote_average")
    val voteAverage: Float,

)
