package com.ecommerce.ecommerce.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ecommerce.ecommerce.model.Product;
import com.ecommerce.ecommerce.repository.ProductRepository;

@Repository
public class ProductDao {
    @Autowired
    private ProductRepository productRepository;

    public Product save(Product p) {
        return productRepository.save(p);
    }

    public List<Product> findBySelerId(Integer id) {
        return productRepository.findBySellerId(id);
    }
}
