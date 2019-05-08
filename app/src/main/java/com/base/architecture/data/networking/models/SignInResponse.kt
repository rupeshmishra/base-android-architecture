package com.base.architecture.data.networking.models

/**
 * Created by Rupesh on 5/8/2019.
 */

data class SignInResponse(val userId: String): BaseResponse {
    override val status: Int = 0
    override val responseCode: Int = 0
    override val message: String? = null
}