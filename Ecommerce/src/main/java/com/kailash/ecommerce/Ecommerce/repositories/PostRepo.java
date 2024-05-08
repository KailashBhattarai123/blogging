package com.kailash.ecommerce.Ecommerce.repositories;

import com.kailash.ecommerce.Ecommerce.entities.Category;
import com.kailash.ecommerce.Ecommerce.entities.Post;
import com.kailash.ecommerce.Ecommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Integer> {
    List<Post> findByUser(User user);
    List<Post> findByCategory(Category category);

    List<Post> findByTitleContaining(String title);
}
