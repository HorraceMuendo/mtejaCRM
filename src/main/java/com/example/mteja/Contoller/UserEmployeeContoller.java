package com.example.mteja.Contoller;

import com.example.mteja.Model.UserEmployee;
import com.example.mteja.Service.UserEmployeeServiceImpl;
import com.example.mteja.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mteja/users")
public class UserEmployeeContoller {

    @Autowired
    private UserEmployeeServiceImpl userService;

    @GetMapping("/")
    public ResponseEntity<List<UserEmployee>> getUsers(){
        List<UserEmployee> users = userService.getUserEmployees();
        System.out.println("Hello world from the server!!!!!!!!");
        return new ResponseEntity(users, HttpStatus.OK);
    }
    @GetMapping("/{userID}")
    public ResponseEntity<UserEmployee> getUser(@PathVariable Long userID){
        Optional<UserEmployee> user = userService.getUserEmployeeById(userID);
        if (user.isPresent()){
            return new ResponseEntity(user.get(), HttpStatus.OK);
        }else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/addUser")
    public ResponseEntity<UserEmployee> addUser(@RequestBody UserEmployee user){
        return new ResponseEntity(userService.addUserEmployee(user), HttpStatus.OK);
    }

    @PutMapping("{userID}")
    public ResponseEntity updateUser(@RequestBody UserEmployee user,@PathVariable Long userID){

        return new ResponseEntity(userService.updateUserEmployee(user,userID),HttpStatus.OK);
    }
    @DeleteMapping("{userID}")
    public ResponseEntity deleteUserById(@PathVariable Long userID){
        userService.deleteUserEmployeeById(userID);
        return new ResponseEntity("User Deleted successfully",HttpStatus.OK);
    }
}
