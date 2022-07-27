package io.github.asephermann.plugins.googleplayserviceschecker

import android.app.Activity
import android.util.Log
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.GoogleApiAvailability


const val TAG = "CHECK_RESULT"

class GooglePlayServicesChecker {

    fun check(activity: Activity): Boolean {
        val apiAvailability: GoogleApiAvailability = GoogleApiAvailability.getInstance()
        val resultCode: Int = apiAvailability.isGooglePlayServicesAvailable(activity)
        if (resultCode != ConnectionResult.SUCCESS) {
            if (apiAvailability.isUserResolvableError(resultCode)) {
                Log.d(TAG, "Google Play Services is not available");
            } else {
                Log.d(TAG, "This device is not supported.")
            }
            return false
        }
        Log.d(TAG, "Google Play Services is available");

        return true
    }
}