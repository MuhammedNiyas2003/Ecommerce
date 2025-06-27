package com.ecommerce.ecommerce.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommerce.model.Seller;
import com.ecommerce.ecommerce.response.ResponseStructure;
import com.ecommerce.ecommerce.service.SellerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequestMapping("/seller")
@RestController
public class SellerController {
    @Autowired
    private SellerService sellerService;
    @PutMapping
    public ResponseEntity<ResponseStructure<Seller>> save(@RequestBody Seller seller) {
        return sellerService.save(seller);      
    }
    
}
