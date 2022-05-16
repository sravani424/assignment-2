package com.product.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.product.entity.Product;

public interface ProductRepository extends MongoRepository<Product, Integer>{

	Optional<Product> findByName(String name);
}
