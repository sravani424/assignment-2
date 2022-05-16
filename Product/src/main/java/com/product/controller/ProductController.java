package com.product.controller;

import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	@PostMapping("/product")
	public Product createProduct(@RequestBody Product product) {
		return  service.createProduct(product);
	}
	
	@GetMapping("/productById/{id}")
	public Optional<Product> getProductById(@PathVariable Integer id) {
		return  service.getProductById(id);
	}
	
	@GetMapping("/productByName/{name}")
	public Optional<Product> getProductByName (@PathVariable String name) {
		return  service.getProductByName(name);
	}
}
