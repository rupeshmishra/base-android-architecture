package com.base.architecture.domain.framework

import io.reactivex.Single

interface SingleUseCase<T> {
    fun execute(): Single<T>
}
