package com.rythm.product.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;
    Double price;
    @Column(nullable = false)
    ProductType type;
    String brand;


    @Override
    public String toString(){

        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", type='" + type + '\''+
                '}';
    }


}
