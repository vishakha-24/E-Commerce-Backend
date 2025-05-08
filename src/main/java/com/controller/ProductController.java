package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ProductRepository;
import com.entity.Product;


@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {
	@Autowired
	private ProductRepository productRepository;
	
	
	@PostMapping("/sell")
    public Product sellProduct(@RequestBody Product product) {
		return productRepository.save(product);
        
    }
	@GetMapping("/category/{category}")
    public List<Product> getProductsByCategory(@PathVariable String category) {
        return productRepository.findByCategory(category);
    }
}
