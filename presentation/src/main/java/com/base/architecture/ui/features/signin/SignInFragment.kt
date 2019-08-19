package com.base.architecture.ui.features.signin

import android.os.Bundle
import android.view.View
import com.base.architecture.R
import com.base.architecture.databinding.FragmentSigninBinding
import com.base.architecture.domain.entities.models.User
import com.base.architecture.ui.base.frameworks.base.BaseFragment
import com.base.architecture.ui.base.frameworks.extensions.observe
import com.base.architecture.ui.base.frameworks.extensions.validateEmail
import com.base.architecture.ui.base.frameworks.extensions.validatePassword
import kotlinx.android.synthetic.main.fragment_signin.*

/**
 * Created by Rupesh on 5/8/2019.
 */

class SignInFragment : BaseFragment<FragmentSigninBinding, SignInViewModel>() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewmodel = viewModel
        observe(viewModel.authorizedUser, this::onUserSignedIn)
        email_sign_in_button.setOnClickListener { signIn() }
    }

    private fun signIn() {
        if (email.validateEmail(getString(R.string.email_error))) {
            if (password.validatePassword(getString(R.string.password_error))) {
                viewModel.signIn(email.text.toString(), password.text.toString())
            }
        }
    }

    private fun onUserSignedIn(user: User) {
        // do here your work when user is successfully logged in
        viewModel.setMessage(getString(R.string.user_loggedIn))
    }

    override fun getViewModelClass(): Class<SignInViewModel> = SignInViewModel::class.java

    override fun layoutId(): Int = R.layout.fragment_signin
}