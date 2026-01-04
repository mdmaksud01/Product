package com.mak.service;

import java.util.List;

import com.mak.Entity.Product;

public interface ProductService {
	
	Product saveProduct(Product p);
	List<Product> getAllProducts();
	void deleteProduct(Integer id);
	
	Product getProduct(Integer id);
}

