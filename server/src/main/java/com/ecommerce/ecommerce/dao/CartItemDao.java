package com.ecommerce.ecommerce.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.ecommerce.model.CartItem;
import com.ecommerce.ecommerce.repository.CartItemRepository;

@Repository
public class CartItemDao {
    @Autowired
    private CartItemRepository cartItemRepository;

    public CartItem save(CartItem cartItem){
        return cartItemRepository.save(cartItem);
    }
}
