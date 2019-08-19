package com.base.architecture.data.repository

import com.base.architecture.data.networking.models.SignInResponse
import com.base.architecture.domain.entities.models.User
import com.base.architecture.domain.repositories.DataModelMapper

/**
 * Created by rupesh on 09,August,2019
 */
class UserModelMapper : DataModelMapper<SignInResponse, User> {

    override fun fromEntity(from: SignInResponse): User {
        return User(from.userId)
    }

    override fun toEntity(from: User): SignInResponse {
        return SignInResponse(from.id)
    }
}