package io.android_architecture.base.core

import android.content.Context
import androidx.multidex.MultiDexApplication

class BaseApplication : MultiDexApplication() {

    companion object {

        lateinit var instance: BaseApplication
    }

    init {
        instance = this
    }

    fun applicationContext(): Context {
        return instance.applicationContext
    }

    override fun onCreate() {
        super.onCreate()


    }
}