package com.base.architecture.data.networking.services

import com.base.architecture.data.networking.ApplicationApis
import com.base.architecture.data.networking.models.SignInResponse
import com.base.architecture.domain.entities.models.User
import io.reactivex.Single
import javax.inject.Singleton

@Singleton
class UserAccountService(val applicationApis: ApplicationApis) {

    fun signIn(user: User): Single<SignInResponse> {
        return applicationApis.signIn(user)
    }
}