package com.mahshad.shoppingorganizer.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

interface AppComponent {
    @Singleton
    @Component(
        modules = [DatabaseModule::class]
    )
    interface AppComponent {
        @Component.Factory
        interface Factory {
            fun create(@BindsInstance context: Context): AppComponent
        }

        //fun inject(activity: MainActivity)
    }
}