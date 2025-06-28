package com.ecommerce.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;

import com.ecommerce.ecommerce.model.Cart;

import jakarta.persistence.QueryHint;
public interface CartRepository extends JpaRepository<Cart,Integer> {

    @Query("select c from Cart c where c.customer.id = ?1")
    @QueryHints(@QueryHint(name = "org.hibernate.cacheable", value = "true"))
    public  Optional<Cart> findCartByUserId(int id);
    
}
