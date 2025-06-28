package com.ecommerce.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.ecommerce.model.Users;

public interface UserRepository extends JpaRepository<Users,Integer>{
    public Optional<Users> findByEmail(String email);
    public Optional<Users> findByUsername(String username);
 }
