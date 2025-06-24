package com.ecommerce.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommerce.model.CartItem;
import com.ecommerce.ecommerce.response.ResponseStructure;
import com.ecommerce.ecommerce.service.CartItemService;

@RequestMapping()
@RestController
public class CartItemController {
    @Autowired
    private CartItemService cartItemService;
    public ResponseEntity<ResponseStructure<CartItem>> save(@RequestBody CartItem cartItem ,@PathVariable int cartId,@PathVariable int productId){
        return cartItemService.save(cartItem);
    }
}
