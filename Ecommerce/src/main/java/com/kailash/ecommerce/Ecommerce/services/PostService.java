package com.kailash.ecommerce.Ecommerce.services;

import com.kailash.ecommerce.Ecommerce.entities.Post;
import com.kailash.ecommerce.Ecommerce.payloads.PostDto;
import com.kailash.ecommerce.Ecommerce.payloads.PostResponse;

import java.util.List;

public interface PostService {

    //Create
    PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

    //update
    PostDto updatePost(PostDto postDto, Integer postId);

    //delete
    void deletePost(Integer postId);

    //get all posts
    PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);

    //get single post
    PostDto getPostById(Integer postId);

    //get all post by category
    List<PostDto> getPostsByCategory(Integer categoryId);

    //get all posts by user
    List<PostDto> getPostByUser(Integer userId);

    //search posts
    List<PostDto> searchPosts(String keyword);


}
