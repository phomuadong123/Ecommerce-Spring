package com.ecommerce.library.service;

import java.util.Optional;



import java.util.List;


import com.ecommerce.library.model.Category;


public interface CategoryService {
    Category save(Category category);

    Category update(Category category);

    List<Category> findAll();

    Optional<Category> findById(Long id);

    void deleteById(Long id);

    void enableById(Long id);

    List<Category> findAllByActivatedTrue();

    // List<CategoryDto> getCategoriesAndSize();
} 