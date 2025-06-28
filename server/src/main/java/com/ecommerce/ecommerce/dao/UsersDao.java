package com.ecommerce.ecommerce.dao;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ecommerce.ecommerce.model.Users;
import com.ecommerce.ecommerce.repository.UserRepository;

@Repository
public class UsersDao {

    @Autowired
    private UserRepository userRepository;

    public Optional<Users> findById(int id) {
        return userRepository.findById(id);
    }

    public Users save(Users u){
        return userRepository.save(u);
    }
    public Optional<Users> findByUsername(String username){
        return userRepository.findByUsername(username);
    }

    public Optional<Users> findByEmail(String email){
        return userRepository.findByEmail(email);
    }
}
