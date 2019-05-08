package com.base.architecture.domain.entities.models

import com.base.architecture.data.networking.models.SignInResponse

/**
 * Created by Rupesh on 5/8/2019.
 */

data class User (val id: String = ""){
    constructor(signInResponse: SignInResponse): this(signInResponse.userId)
}