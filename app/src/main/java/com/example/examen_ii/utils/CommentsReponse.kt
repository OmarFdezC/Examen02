package com.example.examen_ii.utils

import com.example.examen_ii.entity.CommentEntity

data class CommentsReponse(
    val estado: Int,
    val msg: String,
    val comments: List<CommentEntity>,
)
