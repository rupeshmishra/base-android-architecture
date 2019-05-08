package com.base.architecture.ui.base.di.modules

import com.base.architecture.ui.base.di.scopes.ActivityScope
import com.base.architecture.ui.features.signin.OnBoardingActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Rupesh on 5/8/2019.
 */

@Module
internal abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [FragmentModule::class])
    @ActivityScope
    abstract fun onboardingActivity(): OnBoardingActivity
}