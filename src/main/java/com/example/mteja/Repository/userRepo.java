package com.example.mteja.Repository;

import com.example.mteja.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<User,Long> {
}
