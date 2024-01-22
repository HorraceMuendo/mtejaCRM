package com.example.mteja.Repository;

import com.example.mteja.Model.Leads;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface leadsRepo extends JpaRepository<Leads,Long> {

}
