package com.kolos.paymentsystemsprototype.controllers;

import com.kolos.paymentsystemsprototype.entity.Product;
import com.kolos.paymentsystemsprototype.services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable(value = "id") Long id){
        return productService.getOne(id);
    }

    @PutMapping
    public Product updateProduct(@RequestBody Product product) {
        return productService.save(product);
    }

    @DeleteMapping("{/id}")
    public void deleteProduct(@PathVariable(value = "id") Long id) {
        productService.deleteById(id);
    }
}
