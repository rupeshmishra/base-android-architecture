package com.base.architecture.domain.framework

import io.reactivex.Completable

/**
 * Created by Rupesh on 5/8/2019.
 */

interface CompletableUseCaseWithParameter<P> {
    fun execute(parameter: P): Completable
}
