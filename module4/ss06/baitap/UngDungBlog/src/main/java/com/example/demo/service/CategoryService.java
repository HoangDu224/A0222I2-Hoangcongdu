package com.example.demo.service;

import com.example.demo.model.Blog;
import com.example.demo.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    void add(Category category);
    void delete(int id);
    void update(Category category);
    Category findById(int id);
}
