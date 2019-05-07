package com.base.architecture.ui.base.di.modules

import com.base.architecture.ui.base.di.scopes.ActivityScope
import com.base.architecture.ui.features.signin.OnboardingActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [FragmentModule::class])
    @ActivityScope
    abstract fun onboardingActivity(): OnboardingActivity
}