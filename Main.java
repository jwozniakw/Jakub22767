package com.example.project;

import com.example.project.repository.UserRepository;
import com.example.project.repository.ProductRepository;
import com.example.project.service.UserService;
import com.example.project.service.ProductService;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        ProductRepository productRepository = new ProductRepository();

        UserService userService = new UserService(userRepository);
        ProductService productService = new ProductService(productRepository);

    
    }
}
