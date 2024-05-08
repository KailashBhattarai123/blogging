package com.kailash.ecommerce.Ecommerce.services;

import com.kailash.ecommerce.Ecommerce.payloads.CommentDto;

public interface CommentService {
    CommentDto createComment(CommentDto commentDto, Integer postId);
    void deleteComment(Integer commentId);
}
