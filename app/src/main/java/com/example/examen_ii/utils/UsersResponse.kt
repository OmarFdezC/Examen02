package com.example.examen_ii.utils

import com.example.examen_ii.entity.UserEntity

data class UsersResponse(
    val estado: Int,
    val msg: String,
    val users: List<UserEntity>,
)
