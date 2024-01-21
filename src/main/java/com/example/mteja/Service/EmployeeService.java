package com.example.mteja.Service;

import com.example.mteja.Model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Employee addEmployee(Employee Employee);

    List<Employee> getEmployees();

    Optional<Employee> getEmployeeById(Long EmployeeID);

    Employee updateEmployee(Employee employee, Long EmployeeID);

    void deleteEmployeeById(Long EmployeeID);
}
