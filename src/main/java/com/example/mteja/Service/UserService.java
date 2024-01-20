package com.example.mteja.Service;

import com.example.mteja.Model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User addUser(User user);

    List<User> getUsers();

    Optional<User> getUserById(Long userID);

    User updateUser(User user, Long userID);

    void deleteUserById(Long userID);
}
