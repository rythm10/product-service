package com.rythm.product.controller;

import com.rythm.product.model.Product;
import com.rythm.product.service.ProductService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product prd){

        return service.addProduct(prd);

    }

    @GetMapping("/products/{name}")
    public Product getProduct(@PathVariable String name){
        return Optional.ofNullable(service.findByName(name)).orElseThrow();
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.findAllProducts();
    }

}
