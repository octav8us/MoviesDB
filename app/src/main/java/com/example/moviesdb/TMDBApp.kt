package com.example.moviesdb

import android.app.Application
import com.example.moviesdb.database.TMDBRoomDatabase

class TMDBApp: Application() {



        val database: TMDBRoomDatabase by lazy { TMDBRoomDatabase.getDatabase(this) }
    }
