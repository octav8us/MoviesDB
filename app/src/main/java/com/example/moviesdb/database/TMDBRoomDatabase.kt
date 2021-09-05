package com.example.moviesdb.database


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/**,,
 * Database class with a singleton INSTANCE object.
 */
@Database(entities = [popMovies::class,,], version = 1, exportSchema = false)
abstract class TMDBRoomDatabase : RoomDatabase() {

    abstract fun TMDBRoomDatabase(): MovieDao

    companion object {
        @Volatile
        private var INSTANCE: TMDBRoomDatabase? = null

        fun getDatabase(context: Context): TMDBRoomDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    TMDBRoomDatabase::class.java,
                    "TMDB_database"
                )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }
}
