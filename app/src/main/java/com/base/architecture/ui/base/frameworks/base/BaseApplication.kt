package com.base.architecture.ui.base.frameworks.base

import com.base.architecture.ui.base.di.AppComponent
import dagger.android.support.DaggerApplication

abstract class BaseApplication : DaggerApplication() {

    abstract val appComponent: AppComponent

    override fun applicationInjector() = appComponent
}