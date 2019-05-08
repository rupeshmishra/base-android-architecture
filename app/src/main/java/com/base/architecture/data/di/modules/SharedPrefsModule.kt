package com.base.architecture.data.di.modules

import android.content.Context
import com.base.architecture.data.prefs.SharedPrefs
import com.base.architecture.domain.repositories.PrefsRepo
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Rupesh on 5/8/2019.
 */

@Module
class SharedPrefsModule {

    @Singleton
    @Provides
    fun provideSharedPrefs(context: Context): SharedPrefs {
        return SharedPrefs(context)
    }

    @Singleton
    @Provides
    fun providePrefsRepo(context: Context): PrefsRepo {
        return SharedPrefs(context)
    }
}