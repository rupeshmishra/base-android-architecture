package com.base.architecture.data.networking.services

import com.base.architecture.data.networking.ApplicationApis
import com.base.architecture.data.repository.UserModelMapper
import com.base.architecture.domain.entities.models.SignInInfo
import com.base.architecture.domain.entities.models.User
import io.reactivex.Single
import javax.inject.Singleton

/**
 * Created by Rupesh on 5/8/2019.
 */

@Singleton
class UserAccountService(
    val api: ApplicationApis,
    private val mapper: UserModelMapper
) {

    fun signIn(request: SignInInfo): Single<User> {
        return api.signIn(request).map { mapper.fromEntity(it) }
    }
}