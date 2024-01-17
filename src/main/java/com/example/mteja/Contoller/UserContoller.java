package com.example.mteja.Contoller;

import com.example.mteja.Repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mteja/users")
public class UserContoller {
    @Autowired
    public userRepo UserRepo;

    @GetMapping("users")
    public ResponseEntity getUsers(){

        return null;
    }
    @GetMapping
    public ResponseEntity getUser(){

        return null;
    }

}
