package com.ecommerce.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.dao.CartItemDao;

@Service
public class CartItemService {
    @Autowired
    private CartItemDao cartItemDao;
}
