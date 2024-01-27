package com.muendo.mteja.Repository;

import com.muendo.mteja.Model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepo extends JpaRepository<Employee,Long> {
    Employee findByUsername(String username);
}
