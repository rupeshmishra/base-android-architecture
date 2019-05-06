package com.base.architecture.domain.repositories

import com.base.architecture.data.networking.models.SignInResponse
import com.base.architecture.domain.entities.models.User
import io.reactivex.Completable
import io.reactivex.Single

interface UserAccountRepository {

    fun signIn(user: User): Single<SignInResponse>
}