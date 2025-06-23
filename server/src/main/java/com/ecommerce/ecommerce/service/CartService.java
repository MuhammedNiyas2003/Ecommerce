package com.ecommerce.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.dao.CartDao;

@Service
public class CartService {
    @Autowired
    private CartDao cartDao;
   
}
