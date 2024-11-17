package com.balaji.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.balaji.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

}
