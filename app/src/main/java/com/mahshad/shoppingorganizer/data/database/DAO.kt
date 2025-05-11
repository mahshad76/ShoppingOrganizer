package com.mahshad.shoppingorganizer.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import io.reactivex.Completable
import io.reactivex.Maybe
import io.reactivex.Single

@Dao
interface DAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(user: UserEntity): Completable

    @Update
    fun updateUser(user: UserEntity): Completable

    @Delete
    fun delete(user: UserEntity): Completable

    @Query("SELECT * FROM users")
    fun getAllUsers(): Single<List<UserEntity>>

    @Query("SELECT * FROM users WHERE id = :id")
    fun getUserById(id: Int): Maybe<UserEntity>

}