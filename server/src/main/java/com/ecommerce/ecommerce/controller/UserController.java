package com.ecommerce.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommerce.model.Users;
import com.ecommerce.ecommerce.response.ResponseStructure;
import com.ecommerce.ecommerce.service.UserService;

@RequestMapping("/user")
@RestController
public class UserController {
   @Autowired
   private UserService userService;

   @PostMapping
   public ResponseEntity<ResponseStructure<Users>> save(@RequestBody Users user) {
      return userService.save(user);
   }
}
