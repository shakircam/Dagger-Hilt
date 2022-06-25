package com.example.daggerhilt.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.daggerhilt.model.UserEntity


@Database(entities = [UserEntity::class],version = 1,exportSchema = false)
abstract class UserDatabase: RoomDatabase() {

    abstract fun recipesDao() : UserDao
}