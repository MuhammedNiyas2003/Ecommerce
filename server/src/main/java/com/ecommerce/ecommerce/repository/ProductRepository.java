package com.ecommerce.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;

import com.ecommerce.ecommerce.model.Product;

import jakarta.persistence.QueryHint;
public interface ProductRepository extends JpaRepository<Product,Integer> {
    @Query("select p from Prodcuct p where p.seller.id = ?1")
    @QueryHints(@QueryHint(name = "org.hibernate.cacheable", value = "true"))
    public List<Product> findBySellerId(Integer id);
}
