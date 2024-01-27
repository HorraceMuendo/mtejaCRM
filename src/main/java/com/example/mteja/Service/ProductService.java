package com.example.mteja.Service;

import com.example.mteja.Model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
  Product addProduct(Product product);
  List<Product> getProducts();
  Optional<Product>getProductById(Long ProductID);
  Product updateProductById(Product product,Long ProductID);
  void deleteProduct(Long ProductID);
}
