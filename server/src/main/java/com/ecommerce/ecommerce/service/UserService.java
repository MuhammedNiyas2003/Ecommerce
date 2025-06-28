package com.ecommerce.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.dao.UsersDao;
import com.ecommerce.ecommerce.exception.InvalidDetailsException;
import com.ecommerce.ecommerce.exception.InvalidEmailException;
import com.ecommerce.ecommerce.exception.InvalidUsernameException;
import com.ecommerce.ecommerce.model.Users;
import com.ecommerce.ecommerce.response.ResponseStructure;

@Service
public class UserService {
    @Autowired
    private UsersDao usersDao;

    public ResponseEntity<ResponseStructure<Users>> save(Users user) {
        Optional.ofNullable(usersDao.findByUsername(user.getUsername()))
                .filter(Optional::isEmpty)
                .orElseThrow(InvalidUsernameException::new);

        Optional.ofNullable(usersDao.findByUsername(user.getEmail()))
                .filter(Optional::isEmpty)
                .orElseThrow(InvalidEmailException::new);

        if (user.getUsername().trim().length() >= 5 && user.getPassword().trim().length() >= 8) {
            ResponseStructure<Users> rs = new ResponseStructure<>();
            rs.setData(user);
            rs.setMessage("Success");
            rs.setStatusCode(HttpStatus.ACCEPTED.value());
            return new ResponseEntity<>(rs, HttpStatus.ACCEPTED);
        } else {
            throw new InvalidDetailsException();
        }

    }
}
