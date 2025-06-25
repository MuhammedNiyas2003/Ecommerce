package com.ecommerce.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.dao.CartDao;
import com.ecommerce.ecommerce.model.Cart;
import com.ecommerce.ecommerce.response.ResponseStructure;

@Service
public class CartService {
    @Autowired
    private CartDao cartDao;

    public  ResponseEntity<ResponseStructure<Cart>> save(Cart c) {
        return null;
    }
   
}
