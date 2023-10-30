package com.example.microservicesguerrero.model.repository;

import com.example.microservicesguerrero.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
