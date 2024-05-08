package com.kailash.ecommerce.Ecommerce.repositories;

import com.kailash.ecommerce.Ecommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
