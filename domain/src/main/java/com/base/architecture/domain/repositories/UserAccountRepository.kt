package com.base.architecture.domain.repositories

import com.base.architecture.domain.entities.models.SignInInfo
import com.base.architecture.domain.entities.models.User
import io.reactivex.Single

/**
 * Created by Rupesh on 5/8/2019.
 */

interface UserAccountRepository {

    fun signIn(request: SignInInfo): Single<User>
}