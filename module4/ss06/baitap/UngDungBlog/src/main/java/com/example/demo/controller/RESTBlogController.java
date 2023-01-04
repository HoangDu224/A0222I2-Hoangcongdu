package com.example.demo.controller;

import com.example.demo.form.BlogForm;
import com.example.demo.model.Blog;
import com.example.demo.model.Category;
import com.example.demo.service.BlogService;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restBlog")
public class RESTBlogController {
    @Autowired
    BlogService blogService;
    @Autowired
    CategoryService categoryService;
    @GetMapping("/displayBlog")
    public ResponseEntity<List<Blog>> getListBlog(){
        return new ResponseEntity<>(blogService.findAll(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public String createBlog(@RequestBody BlogForm blogForm){
        Integer id = blogForm.getId();
        String title = blogForm.getTitle();
        String content = blogForm.getContent();
        Category category = categoryService.findById(Integer.parseInt(blogForm.getCategoryId()));
        Blog blog = new Blog(id,title,content,category);
        blogService.add(blog);
        new ResponseEntity<>(blogService.findById(id),HttpStatus.CREATED);
        return "success create Blog";
    }
    @GetMapping("/detailBlog/{id}")
    public ResponseEntity<Blog> getDetailBlog(@PathVariable("id") int id){
        return new ResponseEntity<>(blogService.findById(id),HttpStatus.OK);
    }
}
