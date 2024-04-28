package com.example.evently.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.evently.model.CategoryModel;
import com.example.evently.repository.CategoryRespository;

@Service
public class CategoryService {

    @Autowired
    CategoryRespository cr;

    public List<CategoryModel> fetchAllCategory() {
        return cr.findAll();
    }
}
