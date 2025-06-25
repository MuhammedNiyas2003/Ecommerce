package com.ecommerce.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.dao.ProductDao;
import com.ecommerce.ecommerce.dao.SellerDao;
import com.ecommerce.ecommerce.exception.ResourseNotFoundException;
import com.ecommerce.ecommerce.model.Product;
import com.ecommerce.ecommerce.model.Seller;
import com.ecommerce.ecommerce.response.ResponseStructure;

@Service
public class ProductService {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private SellerDao sellerDao;

    public ResponseEntity<ResponseStructure<Product>> save(Product p, int sellerId) {
        Optional<Seller> seller = sellerDao.findById(sellerId);
        if (seller.isPresent()) {
            p.setSeller(seller.get());
            ResponseStructure<Product> rs = new ResponseStructure<>();
            rs.setData(productDao.save(p));
            rs.setStatusCode(HttpStatus.ACCEPTED.value());
            rs.setMessage("Success");
            return new ResponseEntity<>(rs, HttpStatus.ACCEPTED);
        } else {
            throw new ResourseNotFoundException();
        }
    }
}
