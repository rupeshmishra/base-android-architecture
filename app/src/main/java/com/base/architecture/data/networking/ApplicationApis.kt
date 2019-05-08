package com.base.architecture.data.networking

import com.base.architecture.data.networking.models.SignInResponse
import com.base.architecture.data.networking.models.requests.SignInRequest
import io.reactivex.Single
import retrofit2.http.POST
import javax.inject.Singleton

/**
 * Created by Rupesh on 5/8/2019.
 */

@Singleton
interface ApplicationApis {

    @POST("/signIn")
    fun signIn(request: SignInRequest): Single<SignInResponse>
}