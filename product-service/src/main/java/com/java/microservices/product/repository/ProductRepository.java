package com.java.microservices.product.repository;

import com.java.microservices.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProductRepository extends MongoRepository<Product, String> {

}
