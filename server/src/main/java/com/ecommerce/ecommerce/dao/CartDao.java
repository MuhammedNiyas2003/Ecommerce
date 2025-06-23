package com.ecommerce.ecommerce.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.ecommerce.repository.CartRepository;

@Repository
public class CartDao {
    @Autowired
    private CartRepository cartRepository;
}
