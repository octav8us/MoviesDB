package com.example.moviesdb.database

import NowPlaying
import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface MovieDao {

    @Query("SELECT * from NowPlaying ORDER BY name ASC")
    fun getItems(): LiveData<List<NowPlaying>>


    @Query("SELECT SUM(price)FROM cart WHERE quantity>0")
    fun getTotal(): LiveData<Int>

    @Query("DELETE  FROM cart")
    suspend fun cleanTabel()


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: cart)

    @Update
    suspend fun update(item: cart)

    @Query("DELETE FROM cart WHERE id = :id")
    suspend fun delete(id: Int)


}
