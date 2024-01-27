package com.muendo.mteja.Repository;

import com.muendo.mteja.Model.Leads;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface leadsRepo extends JpaRepository<Leads,Long> {

}
