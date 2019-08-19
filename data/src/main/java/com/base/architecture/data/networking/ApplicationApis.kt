package com.base.architecture.data.networking

import com.base.architecture.data.networking.models.SignInResponse
import com.base.architecture.domain.entities.models.SignInInfo
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.POST
import javax.inject.Singleton

/**
 * Created by Rupesh on 5/8/2019.
 */

@Singleton
interface ApplicationApis {

    @POST("/signIn")
    fun signIn(@Body request: SignInInfo): Single<SignInResponse>
}