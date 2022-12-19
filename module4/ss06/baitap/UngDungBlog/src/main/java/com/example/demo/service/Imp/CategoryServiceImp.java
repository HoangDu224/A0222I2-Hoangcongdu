package com.example.demo.service.Imp;

import com.example.demo.model.Blog;
import com.example.demo.model.Category;
import com.example.demo.repository.Categoryrepository;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CategoryServiceImp implements CategoryService {
    @Autowired
    Categoryrepository categoryrepository;
    @Override
    public List<Category> findAll() {
        return categoryrepository.findAll();
    }

    @Override
    public void add(Category category) {
        categoryrepository.save(category);
    }

    @Override
    public void delete(int id) {
        categoryrepository.deleteById(id);
    }

    @Override
    public void update(Category category) {
        categoryrepository.save(category);
    }

    @Override
    public Category findById(int id) {
        return categoryrepository.findById(id).orElse(null);
    }

}
