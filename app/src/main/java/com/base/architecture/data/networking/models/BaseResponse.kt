package com.base.architecture.data.networking.models

interface BaseResponse{
    val status: Int
    val responseCode: Int
    val message: String?
}