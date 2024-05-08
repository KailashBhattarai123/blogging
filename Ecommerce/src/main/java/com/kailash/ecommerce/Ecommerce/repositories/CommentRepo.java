package com.kailash.ecommerce.Ecommerce.repositories;

import com.kailash.ecommerce.Ecommerce.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Integer> {
}
