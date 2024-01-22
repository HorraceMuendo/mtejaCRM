package com.example.mteja.Repository;

import com.example.mteja.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepo extends JpaRepository<Product,Long> {
}
