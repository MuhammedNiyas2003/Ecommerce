package com.ecommerce.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.dao.SellerDao;
import com.ecommerce.ecommerce.model.Seller;
import com.ecommerce.ecommerce.response.ResponseStructure;

@Service
public class SellerService {
    @Autowired
    private SellerDao sellerDao;
    public ResponseEntity<ResponseStructure<Seller>> save(Seller seller){
        ResponseStructure<Seller> res = new ResponseStructure<>();
        res.setData(sellerDao.save(seller));
        res.setMessage("Success");
        res.setStatusCode(HttpStatus.ACCEPTED.value());
        return new ResponseEntity<>(res,HttpStatus.ACCEPTED);
    }

}
