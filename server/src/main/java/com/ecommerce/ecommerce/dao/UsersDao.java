package com.ecommerce.ecommerce.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.ecommerce.repository.UserRepository;

@Repository
public class UsersDao {
    @Autowired
    private UserRepository userRepository;
}
