package com.rythm.product.repository;

import com.rythm.product.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {

    public Product findByName(String name);

    public List<Product> findAll ();
}
