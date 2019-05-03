package com.base.architecture.base.frameworks.sharedelements

import android.view.View

interface HasSharedElements {

    fun getSharedElements(): Map<String, View>

    fun hasReorderingAllowed(): Boolean
}