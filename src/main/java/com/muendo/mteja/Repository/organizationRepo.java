package com.muendo.mteja.Repository;

import com.muendo.mteja.Model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface organizationRepo extends JpaRepository<Organization,Long> {
}
