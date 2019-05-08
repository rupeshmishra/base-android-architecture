package com.base.architecture.domain.repositories

import com.base.architecture.data.networking.models.SignInResponse
import com.base.architecture.data.networking.models.requests.SignInRequest
import com.base.architecture.domain.entities.models.User
import io.reactivex.Completable
import io.reactivex.Single

/**
 * Created by Rupesh on 5/8/2019.
 */

interface UserAccountRepository {

    fun signIn(request: SignInRequest): Single<SignInResponse>
}