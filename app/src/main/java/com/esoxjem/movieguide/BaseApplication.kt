package com.esoxjem.movieguide

import android.app.Application
import android.os.StrictMode

/**
 * @author arunsasidharan
 */

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        StrictMode.enableDefaults()
    }
}
