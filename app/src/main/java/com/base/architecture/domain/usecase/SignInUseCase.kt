package com.base.architecture.domain.usecase

import com.base.architecture.data.networking.models.SignInResponse
import com.base.architecture.domain.entities.models.User
import com.base.architecture.domain.framework.SingleUseCaseWithParameter
import com.base.architecture.domain.repositories.UserAccountRepository
import io.reactivex.Single

class SignInUseCase(private val repo: UserAccountRepository)
    : SingleUseCaseWithParameter<SignInResponse, User> {

    override fun execute(parameter: User): Single<SignInResponse> {
        return repo.signIn(parameter)
    }
}