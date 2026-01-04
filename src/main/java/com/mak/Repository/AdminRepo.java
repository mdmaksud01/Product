package com.mak.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mak.Entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer>{

}
