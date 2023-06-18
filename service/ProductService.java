package com.example.project.service;

import com.example.project.model.Product;
import com.example.project.repository.ProductRepository;

public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

}
