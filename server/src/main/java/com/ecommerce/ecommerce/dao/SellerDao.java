package com.ecommerce.ecommerce.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.ecommerce.model.Seller;
import com.ecommerce.ecommerce.repository.SellerRepository;

@Repository
public class SellerDao {
    @Autowired
    private SellerRepository sellerRepository;

    public Optional<Seller> findById(int id){
        return sellerRepository.findById(id);
    }

    public Seller save(Seller s){
        return sellerRepository.save(s);
    }
}
