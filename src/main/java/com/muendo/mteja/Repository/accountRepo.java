package com.muendo.mteja.Repository;

import com.muendo.mteja.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface accountRepo extends JpaRepository<Account,Long> {
}
