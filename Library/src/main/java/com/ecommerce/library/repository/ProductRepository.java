package com.ecommerce.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.library.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>  {
    
}
