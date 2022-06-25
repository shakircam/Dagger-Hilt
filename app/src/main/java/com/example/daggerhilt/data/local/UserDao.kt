package com.example.daggerhilt.data.local

import androidx.room.Dao
import androidx.room.Insert
import com.example.daggerhilt.model.UserEntity

@Dao
interface UserDao {

    @Insert
    fun insertUserInformation(userEntity: UserEntity)
}