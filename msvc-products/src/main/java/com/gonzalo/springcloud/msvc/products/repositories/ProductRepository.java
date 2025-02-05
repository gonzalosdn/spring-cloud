package com.gonzalo.springcloud.msvc.products.repositories;

import org.springframework.data.repository.CrudRepository;

import com.gonzalo.springcloud.msvc.products.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}