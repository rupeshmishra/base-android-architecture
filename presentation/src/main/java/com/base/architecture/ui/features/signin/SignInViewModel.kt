package com.base.architecture.ui.features.signin

import androidx.lifecycle.MutableLiveData
import com.base.architecture.domain.entities.models.User
import com.base.architecture.domain.entities.models.SignInInfo
import com.base.architecture.domain.usecase.SignInUseCase
import com.base.architecture.ui.base.frameworks.base.BaseViewModel
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by Rupesh on 5/8/2019.
 */

class SignInViewModel @Inject constructor(private val signInUseCase: SignInUseCase) : BaseViewModel() {

    val authorizedUser = MutableLiveData<User>()

    fun signIn(email: String, password: String) {
        val newSignInRequest = SignInInfo(email, password)
        val disposable = signInUseCase.execute(newSignInRequest)
            .subscribeOn(Schedulers.io())
            .subscribe(
                {
                    authorizedUser.value = it
                }, {
                    setError(it)
                }
            )
        addDisposable(disposable)
    }
}