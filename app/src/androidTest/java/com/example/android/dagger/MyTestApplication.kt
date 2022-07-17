package com.example.android.dagger

import com.example.android.dagger.di.AppComponent
import com.example.android.dagger.di.DaggerTestAppComponent

class MyTestApplication : MyApplication() {

    override fun initializeComponent(): AppComponent {
        return DaggerTestAppComponent.create()
    }
}
