package com.example.examen_ii.utils

import com.example.examen_ii.entity.PostEntity

data class PostsReponse (
    val estado: Int,
    val msg: String,
    val posts: List<PostEntity>,
)