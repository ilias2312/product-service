package com.example.product_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository repo) {
        return args -> {
            repo.save(new Product(null, "Ordinateur Portable", 1300, true));
            repo.save(new Product(null, "Imprimante Multifonction", 300, false));
            repo.save(new Product(null, "Smartphone 5G", 800, true));
        };
    }
}