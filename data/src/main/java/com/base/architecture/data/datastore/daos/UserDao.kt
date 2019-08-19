package com.base.architecture.data.datastore.daos
/**
 * Created by Rupesh on 5/8/2019.
 */
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.base.architecture.data.datastore.models.UserDb

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun createUser(user: UserDb)

    @Query("Select * from UserDb where userId = :userId limit 1")
    fun getSingleUserById(userId: String): UserDb
}