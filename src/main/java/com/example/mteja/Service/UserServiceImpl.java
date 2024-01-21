package com.example.mteja.Service;

import com.example.mteja.Model.User;
import com.example.mteja.Repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UserServiceImpl implements UserService{
 @Autowired
 private userRepo UserRepo;

    @Override
    public User addUser(User user) {
        return UserRepo.save(user);
    }

    @Override
    public List<User> getUsers() {
        List<User> users = UserRepo.findAll();
        return users ;
    }

    @Override
    public Optional<User> getUserById(Long userID) {
       Optional<User> user = UserRepo.findById(userID);
       return user;
    }

    @Override
    public User updateUser(User user, Long userID) {
        User userInDB =UserRepo.findById(userID).get();

        if (Objects.nonNull(user.getUsername()) && !"".equalsIgnoreCase(user.getUsername())){
            userInDB.setUsername(user.getUsername());
        }
        if (Objects.nonNull(user.getEmail()) && !"".equalsIgnoreCase(user.getEmail())){
            userInDB.setEmail(user.getEmail());
        }
        if (Objects.nonNull(user.getRole()) && !"".equalsIgnoreCase(user.getRole())){
            userInDB.setRole(user.getRole());
        }
        if (Objects.nonNull(user.getPassword()) && !"".equals(user.getPassword())){
            userInDB.setPassword(user.getPassword());
        }

        return UserRepo.save(userInDB) ;
    }

    @Override
    public void deleteUserById(Long userID) {
        UserRepo.deleteById(userID);
    }
}
