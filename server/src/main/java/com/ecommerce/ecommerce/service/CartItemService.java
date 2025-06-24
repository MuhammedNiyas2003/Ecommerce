package com.ecommerce.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.dao.CartItemDao;
import com.ecommerce.ecommerce.model.CartItem;
import com.ecommerce.ecommerce.response.ResponseStructure;

@Service
public class CartItemService {
    @Autowired
    private CartItemDao cartItemDao;
    public ResponseEntity<ResponseStructure<CartItem>> save(CartItem cartItem){
        ResponseStructure<CartItem> res = new ResponseStructure<CartItem>();
        CartItem c = cartItemDao.save(cartItem);
        res.setData(c);
        res.setStatusCode(HttpStatus.CREATED.value());
        res.setMessage("Succes");
        return new ResponseEntity<>(res,HttpStatus.CREATED);
    }
}
