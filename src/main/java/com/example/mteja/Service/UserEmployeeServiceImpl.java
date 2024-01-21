package com.example.mteja.Service;

import com.example.mteja.Model.UserEmployee;
import com.example.mteja.Repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
@Service
public class UserEmployeeServiceImpl implements UserEmployeeService{

 @Autowired
 private userRepo UserRepo;

    @Override
    public UserEmployee addUserEmployee(UserEmployee UserEmployee) {
        return UserRepo.save(UserEmployee);
    }

    @Override
    public List<UserEmployee> getUserEmployees() {
        List<UserEmployee> UserEmployees = UserRepo.findAll();
        return UserEmployees ;
    }

    @Override
    public Optional<UserEmployee> getUserEmployeeById(Long UserEmployeeID) {
       Optional<UserEmployee> UserEmployee = UserRepo.findById(UserEmployeeID);
       return UserEmployee;
    }



    @Override
    public UserEmployee updateUserEmployee(UserEmployee UserEmployee, Long UserEmployeeID) {
        UserEmployee UserEmployeeInDB =UserRepo.findById(UserEmployeeID).get();

        if (Objects.nonNull(UserEmployee.getUserEmployeename()) && !"".equalsIgnoreCase(UserEmployee.getUserEmployeename())){
            UserEmployeeInDB.setUserEmployeename(UserEmployee.getUserEmployeename());
        }
        if (Objects.nonNull(UserEmployee.getEmail()) && !"".equalsIgnoreCase(UserEmployee.getEmail())){
            UserEmployeeInDB.setEmail(UserEmployee.getEmail());
        }
        if (Objects.nonNull(UserEmployee.getRole()) && !"".equalsIgnoreCase(UserEmployee.getRole())){
            UserEmployeeInDB.setRole(UserEmployee.getRole());
        }
        if (Objects.nonNull(UserEmployee.getPassword()) && !"".equals(UserEmployee.getPassword())){
            UserEmployeeInDB.setPassword(UserEmployee.getPassword());
        }

        return UserRepo.save(UserEmployeeInDB) ;
    }

    @Override
    public void deleteUserEmployeeById(Long UserEmployeeID) {
        UserRepo.deleteById(UserEmployeeID);
    }
}
