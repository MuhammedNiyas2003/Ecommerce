package com.ecommerce.ecommerce.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.ecommerce.model.Cart;
import com.ecommerce.ecommerce.repository.CartRepository;

@Repository
public class CartDao {
    @Autowired
    private CartRepository cartRepository;
    public Cart save(Cart c){
        return cartRepository.save(c);
    }
    public Optional<Cart> findByUserId(int sid){
        return cartRepository.findCartByUserId(sid);
    }
}
