package com.ecommerce.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.dao.SellerDao;

@Service
public class SellerService {
    @Autowired
    private SellerDao sellerDao;
}
