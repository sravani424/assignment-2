package com.product.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
    public Product createProduct(Product product){
    	return repository.save(product);
    }
    

	public Optional<Product> getProductById(Integer id) {
		
		return repository.findById(id);
	}

	public Optional<Product> getProductByName(String name) {
		
		return repository.findByName(name);
	}

	
	
}
