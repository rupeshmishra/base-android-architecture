package com.base.architecture.domain.usecase

import com.base.architecture.data.networking.models.SignInResponse
import com.base.architecture.data.networking.models.requests.SignInRequest
import com.base.architecture.domain.framework.SingleUseCaseWithParameter
import com.base.architecture.domain.repositories.UserAccountRepository
import io.reactivex.Single

/**
 * Created by Rupesh on 5/8/2019.
 */

class SignInUseCase(private val repo: UserAccountRepository)
    : SingleUseCaseWithParameter<SignInResponse, SignInRequest> {

    override fun execute(parameter: SignInRequest): Single<SignInResponse> {
        return repo.signIn(parameter)
    }
}