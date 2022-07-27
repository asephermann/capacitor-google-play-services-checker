package io.github.asephermann.plugins.googleplayserviceschecker

import android.util.Log

class GooglePlayServicesChecker {
    fun echo(value: String): String {
        Log.i("Echo", value)
        return value
    }
}