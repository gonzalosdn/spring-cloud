package com.gonzalo.springcloud.msvc.products.services;

import java.util.List;
import java.util.Optional;

import com.gonzalo.springcloud.msvc.products.entities.Product;

public interface ProductService {

    List<Product> findAll();

    Optional<Product> findById(Long id);

    // Product save(Product product);

    // Optional<Product> update();

    // Optional<Product> delete(Long id);

}
