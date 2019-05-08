package com.base.architecture.domain.framework

import io.reactivex.Single

/**
 * Created by Rupesh on 5/8/2019.
 */

interface SingleUseCaseWithParameter<R, P> {
    fun execute(parameter: P): Single<R>
}
