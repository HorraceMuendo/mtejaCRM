package com.example.mteja.Repository;

import com.example.mteja.Model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface organizationRepo extends JpaRepository<Organization,Long> {
}
