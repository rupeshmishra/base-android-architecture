package com.base.architecture.data.networking

import com.base.architecture.data.networking.models.SignInResponse
import com.base.architecture.domain.entities.models.User
import io.reactivex.Single
import retrofit2.http.POST
import javax.inject.Singleton

@Singleton
interface ApplicationApis {

    @POST("/signIn")
    fun signIn(user: User): Single<SignInResponse>
}