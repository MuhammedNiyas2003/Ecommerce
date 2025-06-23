package com.ecommerce.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.dao.UsersDao;

@Service
public class UserService {
    @Autowired
    private UsersDao usersDao;   
}
