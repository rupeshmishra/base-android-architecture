package com.base.architecture.ui.features.signin

import android.os.Bundle
import android.view.View
import com.base.architecture.R
import com.base.architecture.ui.base.frameworks.base.BaseFragment
import com.base.architecture.databinding.FragmentSigninBinding
import com.base.architecture.domain.entities.models.User
import com.base.architecture.ui.base.frameworks.extensions.observe

/**
 * Created by Rupesh on 5/8/2019.
 */

class SignInFragment: BaseFragment<FragmentSigninBinding, SignInViewModel>() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewmodel = viewModel
        observe(viewModel.authorizedUser, this::onUserAuthorized)
    }

    private fun onUserAuthorized(user: User){
        // do here your work when user is successfully logged in
    }

    override fun getViewModelClass(): Class<SignInViewModel> = SignInViewModel::class.java

    override fun layoutId(): Int = R.layout.fragment_signin
}