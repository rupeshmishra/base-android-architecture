package com.base.architecture.ui.base.di.modules

import com.base.architecture.domain.repositories.UserAccountRepository
import com.base.architecture.domain.usecase.SignInUseCase
import dagger.Module
import dagger.Provides

/**
 * Created by Rupesh on 5/8/2019.
 */

@Module
class UseCaseModule {

    /**
     * Provide all the use cases from here
     */
    @Provides
    fun provideSignInUseCase(userAccountRepository: UserAccountRepository): SignInUseCase{
        return SignInUseCase(userAccountRepository)
    }
}