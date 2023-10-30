package com.example.microservicesguerrero.service;

import com.example.microservicesguerrero.model.dto.ProductRequest;
import com.example.microservicesguerrero.model.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    void createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();
}
