package com.example.product_service;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("*")
public class ProductRestController {

    private final ProductRepository productRepository;

    public ProductRestController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @PostMapping("/products")
    public Product save(@RequestBody Product p) {
        return productRepository.save(p);
    }

    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable Long id) {
        productRepository.deleteById(id);
    }

    @PutMapping("/products/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product p) {
        p.setId(id);
        return productRepository.save(p);
    }
}