package com.example.mteja.Repository;

import com.example.mteja.Model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface employeeRepo extends JpaRepository<Employee,Long> {
    Employee findByUsername(String username);
}
