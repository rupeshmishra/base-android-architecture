package com.base.architecture.ui.base.frameworks.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.base.architecture.ui.base.frameworks.SingleEvent
import com.base.architecture.utils.StringResException
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * Created by Rupesh on 5/8/2019.
 */

abstract class BaseViewModel : ViewModel() {

    private var _errorMessage = MediatorLiveData<SingleEvent<StringResException>>()

    val errorMessage: LiveData<SingleEvent<StringResException>>
        get() = _errorMessage

    private val compositeDisposable: CompositeDisposable = CompositeDisposable()

    protected fun addDisposable(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }

    private fun clearDisposables() {
        compositeDisposable.clear()
    }

    override fun onCleared() {
        clearDisposables()
    }

    protected fun setError(error: StringResException) {
        _errorMessage.postValue(SingleEvent(error))
    }
}