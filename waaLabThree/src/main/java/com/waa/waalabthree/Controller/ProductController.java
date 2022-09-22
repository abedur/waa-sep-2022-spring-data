package com.waa.waalabthree.Controller;

import com.waa.waalabthree.Entity.Product;
import com.waa.waalabthree.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@EnableWebMvc
@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable int id){
        return productService.getProductById(id);
    }

    @PostMapping("/")
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @DeleteMapping("/")
    public void deleteAllProduct(){
        productService.deleteAllProduct();
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable int id){
        productService.deleteProductById(id);
    }

    @PutMapping("/{id}")
    public Product updateProductById(@PathVariable int id, @RequestBody Product product){
        return productService.updateProductById(id, product);
    }
}
