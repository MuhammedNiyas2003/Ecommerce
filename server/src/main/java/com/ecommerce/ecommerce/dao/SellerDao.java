package com.ecommerce.ecommerce.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.ecommerce.repository.SellerRepository;

@Repository
public class SellerDao {
    @Autowired
    private SellerRepository sellerRepository;
}
