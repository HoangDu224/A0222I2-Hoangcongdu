package com.example.demo.controller;

import com.example.demo.form.CategoryForm;
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
@RequestMapping("/restCategory")
public class RESTCategoryController {
    @Autowired
    BlogService blogService;
    @Autowired
    CategoryService categoryService;
    @GetMapping({"","/displayCategory"})
    public ResponseEntity<List<Category>> getListCategory(){
        return new ResponseEntity<>(categoryService.findAll(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public String createCategory(@RequestBody Category category){
        categoryService.add(category);
        new ResponseEntity<>(category,HttpStatus.CREATED);
        return "success create Category";
    }
    @GetMapping("/displayCategoryBlog/{id}")
    public ResponseEntity<List<Blog>> getBlogOfCategory(@PathVariable("id")int id ){
        return new ResponseEntity<>(blogService.findBlogByIdCategory(id),HttpStatus.OK);
    }
//    @GetMapping("/searchBlog")
//    public ResponseEntity<List<Blog>> searchBlog()
}
