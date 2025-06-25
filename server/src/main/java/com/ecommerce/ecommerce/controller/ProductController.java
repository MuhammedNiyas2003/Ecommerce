package com.ecommerce.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommerce.model.Product;
import com.ecommerce.ecommerce.response.ResponseStructure;
import com.ecommerce.ecommerce.service.ProductService;

@RequestMapping("/project")
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("/product")
    public ResponseEntity<ResponseStructure<Product>> save(@RequestBody Product product , @PathVariable int sellerId){
        return  productService.save(product, sellerId);
    }

}
