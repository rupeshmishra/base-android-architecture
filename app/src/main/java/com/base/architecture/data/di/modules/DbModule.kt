package com.base.architecture.data.di.modules

import android.content.Context
import com.base.architecture.data.datastore.AppDB
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

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
    fun provideUserDao(appDB: AppDB){
        return appDB.userDao()
    }

}