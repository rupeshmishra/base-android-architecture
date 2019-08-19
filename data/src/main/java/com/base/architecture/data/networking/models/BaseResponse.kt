package com.base.architecture.data.networking.models

/**
 * Created by Rupesh on 5/8/2019.
 */

interface BaseResponse{
    val status: Int
    val responseCode: Int
    val message: String?
}