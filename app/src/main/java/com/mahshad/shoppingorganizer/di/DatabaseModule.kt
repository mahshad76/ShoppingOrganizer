package com.mahshad.shoppingorganizer.di

import android.content.Context
import androidx.room.Room
import com.mahshad.shoppingorganizer.data.database.UserDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object DatabaseModule {
    @Singleton
    @Provides
    fun provideUserDatabase(context: Context): UserDatabase = Room.databaseBuilder(
        context,
        UserDatabase::class.java,
        "user_database"
    ).build()
}