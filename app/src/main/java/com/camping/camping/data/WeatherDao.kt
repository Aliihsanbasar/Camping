//package com.camping.camping.data
//
//import androidx.room.*
//import kotlinx.coroutines.flow.Flow
//
//@Dao
//interface WeatherDao {
//
//    // Unit table
//    @Query("SELECT * from settings_tbl")
//    fun getUnits(): Flow<List<Unit>>
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun insertUnit(unit: Unit)
//
//    @Update(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun updateUnit(unit: Unit)
//
//    @Query("DELETE from settings_tbl")
//    suspend fun deleteAllUnits()
//
//    @Delete
//    suspend fun deleteUnit(unit: Unit)
//
//}