package com.mak.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mak.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
