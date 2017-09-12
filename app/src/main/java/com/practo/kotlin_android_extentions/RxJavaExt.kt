package com.practo.kotlin_android_extentions

import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
* Subscribe on Schedulers.io()
*
* @See Single<T>.subscribeOn
*/
fun <T> Single<T>.runOnWorker(): Single<T> = this.subscribeOn(Schedulers.io())

/**
* Observe on Schedulers.io()
*
* @See Single<T>.observeOn
*/
fun <T> Single<T>.observerOnUi(): Single<T> = this.observeOn(AndroidSchedulers.mainThread())
