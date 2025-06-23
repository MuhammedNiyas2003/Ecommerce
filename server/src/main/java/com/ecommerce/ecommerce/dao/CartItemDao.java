package com.ecommerce.ecommerce.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ecommerce.ecommerce.repository.CartItemRepository;

@Repository
public class CartItemDao {
    @Autowired
    private CartItemRepository cartItemRepository;
}
