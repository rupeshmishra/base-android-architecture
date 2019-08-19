package com.base.architecture.data.di.modules

import android.content.Context
import com.base.architecture.data.datastore.AppDB
import com.base.architecture.data.datastore.daos.UserDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Rupesh on 5/8/2019.
 */
@Module
class DbModule {

    /**
     * Provide Database and all the Dao's from here
     */
    @Singleton
    @Provides
    fun provideDatabase(context: Context): AppDB {
        return AppDB.getDatabase(context)
    }

    @Singleton
    @Provides
    fun provideUserDao(appDB: AppDB): UserDao{
        return appDB.userDao()
    }
}