package com.practo.kotlin_android_extentions

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.view.ViewGroup

/**
 * Databinding: Inflate a fragment layout
 *
 * @layoutId  = resource id of layout
 * @container = parent layout
 *
 */
fun inflate(layoutId: Int, container: ViewGroup?): ViewDataBinding {
    return DataBindingUtil.inflate(container?.getLayoutInflater(), layoutId, container, false)
}
