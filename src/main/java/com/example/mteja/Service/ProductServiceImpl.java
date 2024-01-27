package com.example.mteja.Service;

import com.example.mteja.Model.Product;
import com.example.mteja.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    public ProductServiceImpl() {
    }

    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

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
    public Product updateProduct(Product product, Long ProductID) {
        Product productDB = productRepo.findById(ProductID).get();
        if (Objects.nonNull(product.getProductName()) && !"".equalsIgnoreCase(product.getProductName())) {
            productDB.setProductName(product.getProductName());
        }
        if (Objects.nonNull(product.getDescription()) && !"".equalsIgnoreCase(product.getDescription())){
            productDB.setDescription(product.getDescription());
        }
        if (Objects.nonNull(product.getPrice()) ){
            productDB.setPrice(product.getPrice());
        }

        return productRepo.save(productDB);
    }

    @Override
    public void deleteProduct(Long ProductID) {
        productRepo.deleteById(ProductID);
    }
}
