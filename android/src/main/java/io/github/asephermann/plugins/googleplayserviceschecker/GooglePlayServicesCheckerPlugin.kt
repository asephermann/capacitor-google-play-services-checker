package io.github.asephermann.plugins.googleplayserviceschecker

import com.getcapacitor.JSObject
import com.getcapacitor.Plugin
import com.getcapacitor.PluginCall
import com.getcapacitor.PluginMethod
import com.getcapacitor.annotation.CapacitorPlugin

@CapacitorPlugin(name = "GooglePlayServicesChecker")
class GooglePlayServicesCheckerPlugin : Plugin() {
    private val implementation = GooglePlayServicesChecker()

    @PluginMethod
    fun check(call: PluginCall) {
        val ret = JSObject()
        ret.put("isAvailable", implementation.check(context))
        call.resolve(ret)

        call.resolve()
    }
}