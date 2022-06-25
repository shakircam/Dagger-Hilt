package com.example.daggerhilt.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    val age : Int,
    val name : String,
    val phone : String,
    val email : String
)
