package com.D121211058.aboutfood


import android.app.Application
import com.D121211058.aboutfood.data.AppContainer
import com.D121211058.aboutfood.data.DefaultAppContainer


class MyApplication: Application() {

    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }

}