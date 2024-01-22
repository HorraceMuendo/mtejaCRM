package com.example.mteja.Repository;

import com.example.mteja.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface accountRepo extends JpaRepository<Account,Long> {
}
