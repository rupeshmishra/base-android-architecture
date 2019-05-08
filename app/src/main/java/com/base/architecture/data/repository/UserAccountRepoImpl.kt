package com.base.architecture.data.repository

import com.base.architecture.data.networking.models.SignInResponse
import com.base.architecture.data.networking.models.requests.SignInRequest
import com.base.architecture.data.networking.services.UserAccountService
import com.base.architecture.domain.repositories.UserAccountRepository
import io.reactivex.Single


/**
 * Created by Rupesh on 5/8/2019.
 */

class UserAccountRepoImpl(private val service: UserAccountService): UserAccountRepository {

    override fun signIn(request: SignInRequest): Single<SignInResponse> {
        return service.signIn(request)
    }
}