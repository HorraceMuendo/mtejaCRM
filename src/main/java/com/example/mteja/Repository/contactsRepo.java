package com.example.mteja.Repository;

import com.example.mteja.Model.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface contactsRepo extends JpaRepository<Contacts,Long> {
}
