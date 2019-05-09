package com.base.architecture.ui.base

import com.base.architecture.BuildConfig
import com.base.architecture.data.di.modules.NetworkModule
import com.base.architecture.ui.base.di.AppComponent
import com.base.architecture.ui.base.di.DaggerAppComponent
import com.base.architecture.ui.base.frameworks.base.BaseApplication

/**
 * Created by Rupesh on 5/9/2019.
 */
class MyApp: BaseApplication() {

    override val appComponent: AppComponent by lazy { DaggerAppComponent.builder()
        .application(this)
        .network(NetworkModule(BuildConfig.BASE_URL))
        .build()
    }
}