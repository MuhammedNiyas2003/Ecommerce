package com.ecommerce.ecommerce.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.ecommerce.repository.ProductRepository;

import jakarta.persistence.Access;

@Repository
public class ProductDao {
    @Autowired
    private ProductRepository productRepository;
}
