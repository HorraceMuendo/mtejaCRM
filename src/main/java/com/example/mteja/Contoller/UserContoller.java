package com.example.mteja.Contoller;

import com.example.mteja.Model.User;
import com.example.mteja.Repository.userRepo;
import com.example.mteja.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mteja/users")
public class UserContoller {
    @Autowired
    private userRepo UserRepo;
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/")
    public ResponseEntity<List<User>> getUsers(){
        List<User> users = userService.getUsers();
        System.out.println("Hello world from the server!!!!!!!!");
        return new ResponseEntity(users, HttpStatus.OK);
    }
    @GetMapping("/{userID}")
    public ResponseEntity<User> getUser(@PathVariable Long userID){
        Optional<User> user = userService.getUserById(userID);
        if (user.isPresent()){
            return new ResponseEntity(user.get(), HttpStatus.OK);
        }else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user){
        return new ResponseEntity(userService.addUser(user), HttpStatus.OK);
    }

    @PutMapping("{userID}")
    public ResponseEntity updateUser(@RequestBody User user,@PathVariable Long userID){

        return new ResponseEntity(userService.updateUser(user,userID),HttpStatus.OK);
    }
    @DeleteMapping("{userID}")
    public ResponseEntity deleteUserById(@PathVariable Long userID){
        userService.deleteUserById(userID);
        return new ResponseEntity("User Deleted successfully",HttpStatus.OK);
    }
}
