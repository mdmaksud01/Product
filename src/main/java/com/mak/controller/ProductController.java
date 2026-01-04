package com.mak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mak.Entity.Product;
import com.mak.service.ProductService;
@Controller
public class ProductController {
	
	@Autowired
	private ProductService ps;
	
	@GetMapping("/")
	public String from() {
		return "AddProduct";
	}
	
	@PostMapping("/save")
	public String saveProduct(@ModelAttribute Product p) {
		ps.saveProduct(p);
		return "redirect:/all";
	}
	
	@GetMapping("/all")
	public String allProducts(Model model) {
		model.addAttribute("products", ps.getAllProducts());
		return "AllProducts";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteProduct(@PathVariable Integer id) {
		ps.deleteProduct(id);
		return "redirect:/all";
	}
	
	@GetMapping("/edit/{id}")
	public String editFrom(@PathVariable Integer id, Model model) {
		model.addAttribute("data",ps.getProduct(id));
		return "Editpage";
	}

}
