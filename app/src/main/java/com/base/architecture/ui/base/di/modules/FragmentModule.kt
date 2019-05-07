package com.base.architecture.ui.base.di.modules

import com.base.architecture.ui.base.di.scopes.PerFragment
import com.base.architecture.ui.features.signin.SignInFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class FragmentModule {

    @ContributesAndroidInjector
    @PerFragment
    abstract fun signInFragment(): SignInFragment
}