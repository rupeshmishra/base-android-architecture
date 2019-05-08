package com.base.architecture.data.prefs

import android.content.Context
import android.content.SharedPreferences
import com.base.architecture.data.utils.StrictModePermitter.permitDiskReads
import com.base.architecture.domain.repositories.PrefsRepo
import javax.inject.Singleton


/**
 * Created by Rupesh on 5/8/2019.
 */

@Singleton
class SharedPrefs(private val ctx: Context) : PrefsRepo {

    companion object {
        const val PREFS_NAME = "PREFS"
        const val PREF_FACT_DATE = "PREF_FACT_DATE"
        const val PREF_SWEET_DATE = "PREF_SWEET_DATE"
        const val PREF_MEASUREMENT_UNIT = "PREF_MEASUREMENT_UNIT"
    }

    private val prefs: SharedPreferences by lazy {
        permitDiskReads {
            ctx.getSharedPreferences(
                PREFS_NAME,
                Context.MODE_PRIVATE
            )
        }
    }
}