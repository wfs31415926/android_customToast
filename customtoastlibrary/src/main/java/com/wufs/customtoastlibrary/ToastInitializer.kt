package com.wufs.customtoastlibrary

import android.content.Context

class ToastInitializer {
    private var appContext: Context? = null

    fun initializer(context: Context?) {
        if (null != context) {
            appContext = context
        }
    }
}
