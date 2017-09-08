package com.practo.kotlin_android_extentions

import android.content.Context

/**
 * Get location service
 *
 * @see Context.LOCATION_SERVICE
 * @see Context.getSystemService
 *
 */
fun Context.getLocationService() = this.getSystemService(Context.LOCATION_SERVICE)

/**
 * Get notification service
 *
 * @see Context.NOTIFICATION_SERVICE
 * @see Context.getSystemService
 *
 */
fun Context.getNotificationService() = this.getSystemService(Context.NOTIFICATION_SERVICE)
