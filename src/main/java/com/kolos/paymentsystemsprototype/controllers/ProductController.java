package com.kolos.paymentsystemsprototype.controllers;

import com.kolos.paymentsystemsprototype.entity.Product;
import com.kolos.paymentsystemsprototype.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
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

    @GetMapping
    public String getProducts(Model model) {
        model.addAttribute("products", this.productService.findAll());
        return "products";
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
