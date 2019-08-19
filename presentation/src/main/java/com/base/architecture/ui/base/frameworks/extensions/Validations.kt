package com.base.architecture.ui.base.frameworks.extensions

import android.util.Patterns
import android.widget.EditText

/**
 * Created by Rupesh on 5/9/2019.
 */

fun EditText.validateEmail(message: String): Boolean {
    return if (this.text.toString().isValidEmail()) {
        true
    } else {
        alert(message)
        false
    }
}

fun EditText.validatePassword(message: String): Boolean {
    return if (this.text.toString().isValidPassword()) {
        true
    } else {
        alert(message)
        false
    }
}

fun String.isValidEmail(): Boolean {
    return isNotBlank() && Patterns.EMAIL_ADDRESS.matcher(this).matches()
}

fun String.isValidPassword(): Boolean {
    return this.length in 8..15
}