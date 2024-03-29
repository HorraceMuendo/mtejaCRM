package com.muendo.mteja.Service;

import com.muendo.mteja.Model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
  Product addProduct(Product product);
  List<Product> getProducts();
  Optional<Product>getProductById(Long ProductID);
  Product updateProduct(Product product,Long ProductID);
  void deleteProduct(Long ProductID);
}
