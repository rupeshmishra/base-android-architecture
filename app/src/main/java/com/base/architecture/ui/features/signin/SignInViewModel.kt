package com.base.architecture.ui.features.signin

import androidx.lifecycle.MutableLiveData
import com.base.architecture.data.networking.models.requests.SignInRequest
import com.base.architecture.domain.entities.models.User
import com.base.architecture.domain.usecase.SignInUseCase
import com.base.architecture.ui.base.frameworks.base.BaseViewModel
import com.base.architecture.utils.StringResException
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by Rupesh on 5/8/2019.
 */

class SignInViewModel @Inject constructor(private val signInUseCase: SignInUseCase) : BaseViewModel() {

    val authorizedUser =  MutableLiveData<User>()

    fun signIn(email: String, password: String) {
        val newSignInRequest = SignInRequest(email, password)
        val disposable = signInUseCase.execute(newSignInRequest).subscribeOn(Schedulers.io()).map { User(it) }.subscribe(
            {
                authorizedUser.value = it
            },{
                setError(it as StringResException)
            }
        )
        addDisposable(disposable)
    }
}