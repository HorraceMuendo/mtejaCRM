package com.example.mteja.Service;

import com.example.mteja.Model.UserEmployee;

import java.util.List;
import java.util.Optional;

public interface UserEmployeeService {
    UserEmployee addUserEmployee(UserEmployee UserEmployee);

    List<UserEmployee> getUserEmployees();

    Optional<UserEmployee> getUserEmployeeById(Long UserEmployeeID);

    UserEmployee updateUserEmployee(UserEmployee UserEmployee, Long UserEmployeeID);

    void deleteUserEmployeeById(Long UserEmployeeID);
}
