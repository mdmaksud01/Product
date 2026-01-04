package com.mak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mak.Entity.Admin;
import com.mak.Repository.AdminRepo;

@Controller
public class validController {
	
	@Autowired
	AdminRepo repo;
	
	@GetMapping("/app")
	public String validpage() {
		return "Validation";
	}
	
	@PostMapping("/login")
	public String validate(@ModelAttribute Admin admin, Model model) {
		Admin a=repo.findById(1).orElse(null);
		if(admin.getName().equals(a.getName())){
			if(admin.getPass().equals(a.getPass())) {
				return "redirect:/all";
			}
		}
		model.addAttribute("message","invalid username and password");
		return "Validation";
		
	}

}
