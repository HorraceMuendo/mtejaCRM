package com.example.mteja.Contoller;

import com.example.mteja.Model.Product;
import com.example.mteja.Service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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
    @GetMapping("/{ProductID}")
    public ResponseEntity<Product> getProductById(@PathVariable Long ProductID){
        Optional<Product> product = productService.getProductById(ProductID);
        if (product.isPresent()){
            return ResponseEntity.ok(product.get());
        }
        else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/{ProductID}")
    public ResponseEntity<Product> editProduct(@RequestBody Product product, @PathVariable Long ProductID){
        return ResponseEntity.ok(productService.updateProduct(product, ProductID));
    }
    @DeleteMapping("{ProductID}")
    public String deleteProductById(@PathVariable Long ProductID){
        productService.deleteProduct(ProductID);
        return "Product_Deleted_Successfully";
    }

}
