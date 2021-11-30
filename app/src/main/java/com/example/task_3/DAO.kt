package com.example.task_3

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface DAO {

    @Insert
    fun insertTask(entity: Entity)

    @Query("SELECT * FROM To_Do")
    fun getTasks():List<Entity>


}