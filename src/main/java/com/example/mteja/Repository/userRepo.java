package com.example.mteja.Repository;

import com.example.mteja.Model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepo extends JpaRepository<Employee,Long> {
}
