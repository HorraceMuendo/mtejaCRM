package com.example.mteja.Repository;

import com.example.mteja.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepo extends JpaRepository<User,Long> {
}
