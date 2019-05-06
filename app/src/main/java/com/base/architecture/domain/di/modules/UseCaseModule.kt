package com.base.architecture.domain.di.modules

import com.base.architecture.domain.repositories.UserAccountRepository
import com.base.architecture.domain.usecase.SignInUseCase
import dagger.Module

@Module
class UseCaseModule {

    /**
     * Provide all the use cases from here
     */
    fun provideSignInUseCase(userAccountRepository: UserAccountRepository): SignInUseCase{
        return SignInUseCase(userAccountRepository)
    }
}