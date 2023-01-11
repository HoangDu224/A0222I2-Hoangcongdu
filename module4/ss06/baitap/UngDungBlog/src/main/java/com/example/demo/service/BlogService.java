package com.example.demo.service;

import com.example.demo.model.Blog;
import com.example.demo.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BlogService {
    List<Blog> findAll();
    Blog findById(int id);
    void add(Blog blog);
    void update(Blog blog);
    void delete(int id);
    List<Blog> findBlogByIdCategory(int id);
    List<Blog> findBlogByTitleContaining(String title);
}
