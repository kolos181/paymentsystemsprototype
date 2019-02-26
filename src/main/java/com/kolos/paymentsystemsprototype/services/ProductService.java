package com.kolos.paymentsystemsprototype.services;

import com.kolos.paymentsystemsprototype.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ProductService  extends JpaRepository<Product, Long> {
}
