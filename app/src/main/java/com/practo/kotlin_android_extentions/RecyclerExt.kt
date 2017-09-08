package com.practo.kotlin_android_extentions

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Initialise a RecyclerView with a vertical LinearLayoutManager
 *
 * @adapter = Adapter for the RecyclerView
 *
 */
infix fun <T : RecyclerView.Adapter<out RecyclerView.ViewHolder>> RecyclerView.initVertical(adapter: T) {
    this.layoutManager = LinearLayoutManager(context)
    this.adapter = adapter
}

/**
 * Inflate a layout for an item in RecyclerView
 *
 * @see RecyclerView.Adapter.onCreateViewHolder
 *
 * @layoutId = Layout id
 * @parent   = ViewGroup
 * @attachToParent = If the view should be added to parent
 *
 */
fun inflate(layoutId: Int, parent: ViewGroup, attachToParent: Boolean = false): View =
        LayoutInflater.from(parent.context).inflate(layoutId, parent, attachToParent)
