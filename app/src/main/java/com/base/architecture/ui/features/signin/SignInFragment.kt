package com.base.architecture.ui.features.signin

import android.os.Bundle
import android.view.View
import com.base.architecture.R
import com.base.architecture.ui.base.frameworks.base.BaseFragment
import com.base.architecture.databinding.FragmentSigninBinding

class SignInFragment: BaseFragment<FragmentSigninBinding, SignInViewModel>() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewmodel = viewModel
    }

    override fun getViewModelClass(): Class<SignInViewModel> = SignInViewModel::class.java

    override fun layoutId(): Int = R.layout.fragment_signin
}