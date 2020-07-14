package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface ProductRepositery extends JpaRepository<Product, Integer>{

}
