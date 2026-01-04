package com.mak.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mak.Entity.Admin;
import com.mak.Repository.AdminRepo;

@Component
public class data implements CommandLineRunner{
	
	@Value("${admin.user.name}")
	String userName;
	@Value("${admin.user.pass}")
	String pass;
	@Autowired
	AdminRepo ar;
	@Override
	public void run(String... args) throws Exception {
		Admin a=new Admin();
		a.setName(userName);
		a.setPass(pass);
		
		ar.save(a);
	}

}
