package com.base.architecture.ui.base.di.modules

import android.app.Application
import android.content.Context
import com.base.architecture.data.di.modules.DbModule
import com.base.architecture.data.di.modules.NetworkModule
import com.base.architecture.data.di.modules.RepoModule
import com.base.architecture.data.di.modules.SharedPrefsModule
import com.base.architecture.ui.base.di.viewmodel.ViewModelModule
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(
    includes = [
        (DbModule::class),
        (NetworkModule::class),
        (RepoModule::class),
        (UseCaseModule::class),
        (ViewModelModule::class),
        (SharedPrefsModule::class)
    ]
)
class AppModule {

    @Provides
    @Singleton
    fun provideContext(application: Application): Context {
        return application.applicationContext
    }
}