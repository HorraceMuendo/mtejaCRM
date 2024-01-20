package com.example.mteja.Service;

import com.example.mteja.Model.User;
import com.example.mteja.Repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService{
 @Autowired
 private userRepo UserRepo;

    @Override
    public User addUser(User user) {
        return UserRepo.save(user);
    }

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public User updateUser(User user, Long userID) {
        return null;
    }

    @Override
    public void deleteUserById(Long userID) {

    }
}
