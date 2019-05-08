package com.base.architecture.data.networking.services

import com.base.architecture.data.networking.ApplicationApis
import com.base.architecture.data.networking.models.SignInResponse
import com.base.architecture.data.networking.models.requests.SignInRequest
import io.reactivex.Single
import javax.inject.Singleton

/**
 * Created by Rupesh on 5/8/2019.
 */

@Singleton
class UserAccountService(val applicationApis: ApplicationApis) {

    fun signIn(request: SignInRequest): Single<SignInResponse> {
        return applicationApis.signIn(request)
    }
}