package com.base.architecture.ui.base.frameworks.sharedelements

import android.view.View

interface HasSharedElements {

    fun getSharedElements(): Map<String, View>

    fun hasReorderingAllowed(): Boolean
}