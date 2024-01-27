package com.example.mteja.Contoller;

import com.example.mteja.Model.Product;
import com.example.mteja.Service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mteja/products")
public class ProductController {
    @Autowired
    private ProductServiceImpl productService;
    @PostMapping("/addProduct")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        return new ResponseEntity(productService.addProduct(product), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<Product> getProducts(){
        return new ResponseEntity(productService.getProducts(),HttpStatus.OK);
    }
}
