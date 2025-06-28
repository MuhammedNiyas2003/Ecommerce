package com.ecommerce.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.dao.CartDao;
import com.ecommerce.ecommerce.dao.UsersDao;
import com.ecommerce.ecommerce.model.Cart;
import com.ecommerce.ecommerce.model.Users;
import com.ecommerce.ecommerce.response.ResponseStructure;

@Service
public class CartService {
    @Autowired
    private CartDao cartDao;

    @Autowired
    private UsersDao usersDao;

    public ResponseEntity<ResponseStructure<Cart>> handleCart(Users user) {
        Cart c = new Cart();
        c.setCustomer(user);
        Optional<Cart> op = cartDao.findByUserId(user.getId());
        ResponseStructure<Cart> rs = new ResponseStructure<>();
        if (op.isPresent()) {
            rs.setData(op.get());
        } else {
            Optional<Users> usr = usersDao.findById(user.getId());
            c.setCustomer(usr.get());
            rs.setData(cartDao.save(c));
        }
        rs.setMessage("Success");
        rs.setStatusCode(HttpStatus.ACCEPTED.value());
        return new ResponseEntity<>(rs, HttpStatus.ACCEPTED);
    }

}
