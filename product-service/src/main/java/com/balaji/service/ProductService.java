package com.balaji.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balaji.dto.ProductRequest;
import com.balaji.model.Product;
import com.balaji.repository.ProductRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;

	public Product createProduct(ProductRequest productRequest) {
		Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
		product= productRepository.save(product);
		log.info("Product {} is saved", product.getId());
		return product;
	}

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
	
	public long getProductsCount() {
		return productRepository.count();
	}

}
