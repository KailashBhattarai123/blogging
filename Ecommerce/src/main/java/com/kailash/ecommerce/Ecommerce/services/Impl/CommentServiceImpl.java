package com.kailash.ecommerce.Ecommerce.services.Impl;

import com.kailash.ecommerce.Ecommerce.entities.Comment;
import com.kailash.ecommerce.Ecommerce.entities.Post;
import com.kailash.ecommerce.Ecommerce.exceptions.ResourceNotFoundException;
import com.kailash.ecommerce.Ecommerce.payloads.CommentDto;
import com.kailash.ecommerce.Ecommerce.repositories.CommentRepo;
import com.kailash.ecommerce.Ecommerce.repositories.PostRepo;
import com.kailash.ecommerce.Ecommerce.services.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private PostRepo postRepo;

    @Autowired
    private CommentRepo commentRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CommentDto createComment(CommentDto commentDto, Integer postId) {
        Post post = postRepo.findById(postId).orElseThrow(()-> new ResourceNotFoundException("Post ", " postId ", postId));
        Comment comment = modelMapper.map(commentDto, Comment.class);
        comment.setPost(post);
        Comment savedComment = this.commentRepo.save(comment);

        return modelMapper.map(savedComment, CommentDto.class);
    }

    @Override
    public void deleteComment(Integer commentId) {
        Comment comment = commentRepo.findById(commentId).orElseThrow(()-> new ResourceNotFoundException("Comment", "CommentId", commentId));
        this.commentRepo.delete(comment);
    }
}
