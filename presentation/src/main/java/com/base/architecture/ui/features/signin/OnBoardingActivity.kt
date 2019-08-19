package com.base.architecture.ui.features.signin

import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import com.base.architecture.R
import com.base.architecture.ui.base.frameworks.base.BaseActivity
import kotlinx.android.synthetic.main.activity_onboarding.*

/**
 * Created by Rupesh on 5/8/2019.
 */

class OnBoardingActivity: BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         * The navigation controller is the NavHostFragment added to this activity's XML
         * This will show the Fragment associated with this action - R.id.action_sign_in.
         * Checkout nav.xml in navigation folder of resources.
         */
        findNavController(R.id.fragment_container).navigate(R.id.action_sign_in)
    }

    /**
     * ID of the XML Content view to be set for this activity
     */
    override fun getContentViewId(): Int = R.layout.activity_onboarding

    /**
     * Root layout of this activity
     */
    override fun getRootLayoutContainer(): View = root_container
}