package com.base.architecture.domain.framework

import io.reactivex.Completable

/**
 * Created by Rupesh on 5/8/2019.
 */

interface CompletableUseCase {
    fun execute(): Completable
}