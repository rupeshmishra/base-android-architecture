package com.base.architecture.base

import android.view.View
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.base.architecture.base.frameworks.extensions.alert
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

abstract class BaseActivity : DaggerAppCompatActivity() {

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory

    abstract fun liftNavBar()
    abstract fun getRootLayoutContainer(): View

    fun alert(stringRes: Int) { getRootLayoutContainer().alert(stringRes) }
    fun alert(string: String) { getRootLayoutContainer().alert(string) }
}

inline fun <reified T : ViewModel> FragmentActivity.viewModel(
    factory: ViewModelProvider.Factory,
    body: T.() -> Unit
): T {
    val vm = ViewModelProviders.of(this, factory)[T::class.java]
    vm.body()
    return vm
}