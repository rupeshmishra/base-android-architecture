package com.base.architecture.data.repository

import com.base.architecture.data.networking.models.SignInResponse
import com.base.architecture.data.networking.services.UserAccountService
import com.base.architecture.domain.entities.models.User
import com.base.architecture.domain.repositories.UserAccountRepository
import io.reactivex.Single

class UserAccountRepoImpl(private val service: UserAccountService): UserAccountRepository {

    override fun signIn(user: User): Single<SignInResponse> {
        return service.signIn(user)
    }
}