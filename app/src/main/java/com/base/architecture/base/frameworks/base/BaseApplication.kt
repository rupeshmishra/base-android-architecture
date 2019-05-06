package com.base.architecture.base.frameworks.base

import com.base.architecture.base.di.AppComponent
import dagger.android.support.DaggerApplication

abstract class BaseApplication : DaggerApplication() {

    abstract val appComponent: AppComponent

    override fun applicationInjector() = appComponent
}