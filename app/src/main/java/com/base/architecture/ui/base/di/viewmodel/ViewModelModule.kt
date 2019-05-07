package com.base.architecture.ui.base.di.viewmodel

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module

@Module
internal abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    /**
     * Bind all the view models here
     */

    /*@Binds
    @IntoMap
    @ViewModelKey(ExampleViewModel::class)
    internal abstract fun bindsConsumedDataPeriodViewModel(exampleViewModel: ExampleViewModel): ViewModel*/
}