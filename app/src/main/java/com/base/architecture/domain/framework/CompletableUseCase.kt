package com.base.architecture.domain.framework

import io.reactivex.Completable

interface CompletableUseCase {
    fun execute(): Completable
}