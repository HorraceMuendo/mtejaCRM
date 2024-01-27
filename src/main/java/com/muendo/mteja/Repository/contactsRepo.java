package com.muendo.mteja.Repository;

import com.muendo.mteja.Model.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface contactsRepo extends JpaRepository<Contacts,Long> {
}
