package com.example.evently.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.evently.model.CategoryModel;


@Repository
public interface CategoryRespository extends JpaRepository<CategoryModel,Integer>{
    
}
