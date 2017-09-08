package com.practo.kotlin_android_extentions

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Inflate a layout for an item in RecyclerView
 *
 * @see RecyclerView.Adapter.onCreateViewHolder
 *
 * @layoutId = Layout id
 * @parent = ViewGroup
 * @attachToParent = If the view should be added to parent
 *
 */
fun ViewGroup.getLayoutInflater(): LayoutInflater = LayoutInflater.from(this.context)
