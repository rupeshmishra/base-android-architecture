package com.base.architecture.ui.base.frameworks.base

import com.base.architecture.ui.base.di.AppComponent
import dagger.android.support.DaggerApplication

/**
 * Created by Rupesh on 5/8/2019.
 */

abstract class BaseApplication : DaggerApplication() {

    abstract val appComponent: AppComponent

    override fun applicationInjector() = appComponent
}