package com.kailash.ecommerce.Ecommerce.services;

import com.kailash.ecommerce.Ecommerce.payloads.CategoryDto;

import java.util.List;

public interface CategoryService {

    //create
    CategoryDto createCategory(CategoryDto categoryDto);

    //update
    CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);

    //delete
     void deleteCategory(Integer categoryId);

    //get
     CategoryDto getCategory(Integer categoryId);

    //get all
    List<CategoryDto> getCategories();
}
