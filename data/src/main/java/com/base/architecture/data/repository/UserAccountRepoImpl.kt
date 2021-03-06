package com.base.architecture.data.repository

import com.base.architecture.data.networking.services.UserAccountService
import com.base.architecture.domain.entities.models.SignInInfo
import com.base.architecture.domain.entities.models.User
import com.base.architecture.domain.repositories.UserAccountRepository
import io.reactivex.Single


/**
 * Created by Rupesh on 5/8/2019.
 */

class UserAccountRepoImpl(private val service: UserAccountService): UserAccountRepository {

    override fun signIn(request: SignInInfo): Single<User> {
        return service.signIn(request)
    }
}