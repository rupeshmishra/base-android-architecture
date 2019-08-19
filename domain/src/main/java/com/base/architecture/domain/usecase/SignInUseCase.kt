package com.base.architecture.domain.usecase

import com.base.architecture.domain.entities.models.SignInInfo
import com.base.architecture.domain.entities.models.User
import com.base.architecture.domain.framework.SingleUseCaseWithParameter
import com.base.architecture.domain.repositories.UserAccountRepository
import io.reactivex.Single

/**
 * Created by Rupesh on 5/8/2019.
 */

class SignInUseCase(private val repo: UserAccountRepository)
    : SingleUseCaseWithParameter<User, SignInInfo> {

    override fun execute(parameter: SignInInfo): Single<User> {
        return repo.signIn(parameter)
    }
}