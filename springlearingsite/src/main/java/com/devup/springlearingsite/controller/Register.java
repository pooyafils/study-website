package com.devup.springlearingsite.controller;

import com.devup.springlearingsite.domain.Users;
import com.devup.springlearingsite.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/register")
public class Register {
    UserRepository userRepository;

    public Register(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Users>> getAllUsers(){
        return ResponseEntity.ok(userRepository.findAll());
    }


    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity RegisterStudent(@RequestBody Users user){
userRepository.save(user);
        return ResponseEntity.ok("you registration  id done ");
    }



}
