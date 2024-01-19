package com.example.mteja.Contoller;

import com.example.mteja.Model.User;
import com.example.mteja.Repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mteja")
public class UserContoller {
    @Autowired
    public userRepo UserRepo;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers(){
        List<User> users = UserRepo.findAll();
        System.out.println("Hello world from the server!!!!!!!!");
        return new ResponseEntity(users, HttpStatus.OK);
    }
    @GetMapping("/users/{userID}")
    public ResponseEntity<User> getUser(@PathVariable Long userID){
        Optional<User> user = UserRepo.findById(userID);
        if (user.isPresent()){
            return new ResponseEntity(user.get(), HttpStatus.OK);
        }else {
            return new ResponseEntity(HttpStatus.OK);
        }
    }
    public ResponseEntity<User> addUser(){

    }

}
