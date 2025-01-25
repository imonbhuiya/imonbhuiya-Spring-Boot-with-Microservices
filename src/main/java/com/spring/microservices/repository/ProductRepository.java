package com.spring.microservices.repository;

import com.spring.microservices.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProductRepository extends MongoRepository<Product,String> {
}
