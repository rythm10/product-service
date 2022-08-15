package com.rythm.product.service;

import com.rythm.product.model.Product;
import com.rythm.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product addProduct(Product prd){
        return repository.save(prd);
    }

    public Product findByName(String prdName){
        return repository.findByName(prdName) ;
    }

    public List<Product> findAllProducts(){
        return repository.findAll();
    }

}
