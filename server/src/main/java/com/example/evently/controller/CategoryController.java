package com.example.evently.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.evently.model.CategoryModel;
import com.example.evently.service.CategoryService;

@RestController
@CrossOrigin
public class CategoryController {

    @Autowired
    CategoryService cs;
   
    //fetchAllCategory
    @GetMapping("/fetchAllCategory")
    public List<CategoryModel> fetchAllCategory() {
        return cs.fetchAllCategory();
    }
}
