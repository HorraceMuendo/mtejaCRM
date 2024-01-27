package com.example.mteja.Service;

import com.example.mteja.Model.Product;
import com.example.mteja.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;


    @Override
    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    @Override
    public Optional<Product> getProductById(Long ProductID) {
        Optional<Product> product = productRepo.findById(ProductID);
      
            return product;

    }

    @Override
    public Product updateProductById(Product product, Long ProductID) {
        return null;
    }

    @Override
    public void deleteProduct(Long ProductID) {

    }
}
