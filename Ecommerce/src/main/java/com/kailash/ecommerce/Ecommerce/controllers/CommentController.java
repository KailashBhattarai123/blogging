package com.kailash.ecommerce.Ecommerce.controllers;

import com.kailash.ecommerce.Ecommerce.entities.Comment;
import com.kailash.ecommerce.Ecommerce.payloads.ApiResponse;
import com.kailash.ecommerce.Ecommerce.payloads.CommentDto;
import com.kailash.ecommerce.Ecommerce.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/post/{postId}/comments")
    public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto comment,
                                                    @PathVariable Integer postId)
    {
        CommentDto createComment = commentService.createComment(comment, postId);
        return new ResponseEntity<CommentDto>(createComment, HttpStatus.CREATED);
    }

    @DeleteMapping("/comments/{commentId}")
    public ResponseEntity<ApiResponse> deleteComment(
            @PathVariable Integer commentId)
    {
        commentService.deleteComment(commentId);
        return new ResponseEntity<ApiResponse>(new ApiResponse("Comment deleted successfully !!", true), HttpStatus.CREATED);
    }

}
