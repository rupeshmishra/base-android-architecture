package com.base.architecture.data.datastore

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import android.content.Context
import com.base.architecture.data.datastore.models.UserDb
import com.base.architecture.data.datastore.typeconvertors.Converters


@Database(entities = [UserDb::class], version = 1, exportSchema = true)
@TypeConverters(Converters::class)
abstract class AppDB : RoomDatabase() {

    abstract fun userDao()

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