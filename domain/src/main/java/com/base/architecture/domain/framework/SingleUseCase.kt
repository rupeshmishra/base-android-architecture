package com.base.architecture.domain.framework

import io.reactivex.Single

/**
 * Created by Rupesh on 5/8/2019.
 */

interface SingleUseCase<T> {
    fun execute(): Single<T>
}
