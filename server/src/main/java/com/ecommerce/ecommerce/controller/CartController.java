package com.ecommerce.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ecommerce.ecommerce.model.Cart;
import com.ecommerce.ecommerce.model.Users;
import com.ecommerce.ecommerce.response.ResponseStructure;
import com.ecommerce.ecommerce.service.CartService;

@RequestMapping("/cart")
@RestController
public class CartController {
    @Autowired
    private CartService cartsService;
    @PostMapping
    public ResponseEntity<ResponseStructure<Cart>> handleAddCart(@RequestBody Users user){
        return cartsService.handleCart(user);
    }

}
