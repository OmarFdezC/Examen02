package com.example.examen_ii.repositories

import com.example.examen_ii.data.ApiComment
import com.example.examen_ii.entity.CommentEntity
import com.example.examen_ii.network.ClienteRetrofit
import com.example.examen_ii.services.CommentService
import com.example.examen_ii.utils.CommentsReponse

class CommentRepository(private val CommentService: CommentService = ClienteRetrofit.getInstanceCommentRetrofit) {
    suspend fun getAllComments(): List<ApiComment> {
        return CommentService.getAllComments()
    }

    suspend fun getCommentsByPostId(id: Int): List<ApiComment> {
        return CommentService.getCommentsByPostId(id)
    }
}