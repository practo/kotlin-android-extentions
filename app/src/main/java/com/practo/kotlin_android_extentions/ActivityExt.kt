package com.practo.kotlin_android_extentions

import android.app.Activity
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding

/**
 * Databinding: Inflate an activity layout
 *
 * @layoutId  = resource id of layout
 *
 */
fun <T : ViewDataBinding> Activity.bindContentView(layoutId: Int): T
        = DataBindingUtil.setContentView(this, layoutId)
