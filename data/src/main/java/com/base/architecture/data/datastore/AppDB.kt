package com.base.architecture.data.datastore

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import android.content.Context
import com.base.architecture.data.datastore.daos.UserDao
import com.base.architecture.data.datastore.models.UserDb
import com.base.architecture.data.datastore.typeconvertors.Converters

/**
 * Created by Rupesh on 5/8/2019.
 */
@Database(entities = [UserDb::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class AppDB : RoomDatabase() {

    abstract fun userDao(): UserDao

    companion object {
        @Volatile
        private var INSTANCE: AppDB? = null

        fun getDatabase(context: Context): AppDB {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(context,
                    AppDB::class.java,
                        "app_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}