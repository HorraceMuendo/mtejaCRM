package com.example.mteja.Service;

import com.example.mteja.Model.Employee;
import com.example.mteja.Repository.employeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
@Service
public class EmployeeServiceImpl implements EmployeeService{

 @Autowired
 private employeeRepo employeeRepo;

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> getEmployees() {
        List<Employee> employees = employeeRepo.findAll();
        return employees ;
    }

    @Override
    public Optional<Employee> getEmployeeById(Long EmployeeID) {
       Optional<Employee> employee = employeeRepo.findById(EmployeeID);
       return employee;
    }



    @Override
    public Employee updateEmployee(Employee employee, Long EmployeeID) {
        Employee EmployeeInDB = employeeRepo.findById(EmployeeID).get();

        if (Objects.nonNull(employee.getUsername()) && !"".equalsIgnoreCase(employee.getUsername())){
            EmployeeInDB.setUsername(employee.getUsername());
        }
        if (Objects.nonNull(employee.getEmail()) && !"".equalsIgnoreCase(employee.getEmail())){
            EmployeeInDB.setEmail(employee.getEmail());
        }
        if (Objects.nonNull(employee.getRole()) && !"".equalsIgnoreCase(employee.getRole())){
            EmployeeInDB.setRole(employee.getRole());
        }
        if (Objects.nonNull(employee.getPassword()) && !"".equals(employee.getPassword())){
            EmployeeInDB.setPassword(employee.getPassword());
        }

        return employeeRepo.save(EmployeeInDB) ;
    }

    @Override
    public void deleteEmployeeById(Long EmployeeID) {
        employeeRepo.deleteById(EmployeeID);
    }
}
