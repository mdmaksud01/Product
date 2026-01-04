package com.mak.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mak.Entity.Product;
import com.mak.Repository.ProductRepo;

@Service
public class ProductServiceImplementation implements ProductService{
	
	@Autowired
	private ProductRepo repo;
	@Override
	public Product saveProduct(Product p) {
		return repo.save(p);
	}

	@Override
	public List<Product> getAllProducts() {
		return repo.findAll();
	}

	@Override
	public void deleteProduct(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Product getProduct(Integer id) {
		return repo.findById(id).orElse(null);
	}

}
