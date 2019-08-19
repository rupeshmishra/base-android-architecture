package com.base.architecture.data.di.modules

import com.base.architecture.data.networking.services.UserAccountService
import com.base.architecture.data.repository.UserAccountRepoImpl
import com.base.architecture.domain.repositories.UserAccountRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Rupesh on 5/8/2019.
 */

@Module
class RepoModule {

    /**
     * Provide all the Repositories from here
     */
    @Singleton
    @Provides
    fun provideAccountRepo(userAccountService: UserAccountService): UserAccountRepository{
        return UserAccountRepoImpl(userAccountService)
    }
}