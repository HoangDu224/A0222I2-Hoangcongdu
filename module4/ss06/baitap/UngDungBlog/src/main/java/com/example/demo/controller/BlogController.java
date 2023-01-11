package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.model.Category;
import com.example.demo.service.BlogService;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping({""})
public class BlogController {

    @Autowired
    BlogService blogService;
    @Autowired
    CategoryService categoryService;
    @GetMapping({"home"})
    public String displayBlog(Model model){
        model.addAttribute("list",blogService.findAll());
        return "home";
    }
    @GetMapping("create")
    public String showCreate(Model model){
        model.addAttribute("category",categoryService.findAll());
        model.addAttribute("Blog",new Blog());
        return "create";
    }
    @PostMapping("create")
    public String doCreate(@Valid @ModelAttribute("Blog")Blog blog){
        blogService.add(blog);
        return "redirect:/category";
    }
    @GetMapping("edit/{id}")
    public String showEdit(@PathVariable("id")int id, Model model){
        model.addAttribute("Blog", blogService.findById(id));
        return "edit";
    }
    @PostMapping("edit")
    public String doEdit(@Valid @ModelAttribute("Blog")Blog blog){
        blogService.update(blog);
        return "redirect:/category";
    }
    @GetMapping("delete/{id}")
    public String doDelete(@PathVariable("id")int id ){
        blogService.delete(id);
        return "redirect:/category";
    }
    @GetMapping("detail/{id}")
    public String showDetail(@PathVariable("id")int id , Model model){
         model.addAttribute("Blog",blogService.findById(id));
         return "detail";

    }
    @GetMapping({"","category"})
    public String displayCategory(Model model){
        model.addAttribute("category", new Category());
        model.addAttribute("categoryList",categoryService.findAll());
        return "category";
    }
    @PostMapping({"createCategory"})
    public String createCategory(@Valid@ModelAttribute("category")Category category,BindingResult bindingResult,Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("categoryList",categoryService.findAll());
            return "category";
        }
            categoryService.add(category);
            return "redirect:category";
    }
    @GetMapping("showCategory/{id}")
    public String showCategory(@PathVariable("id")int id ,Model model){
        model.addAttribute("list",blogService.findBlogByIdCategory(id));
        return "home";
    }
    @GetMapping("deleteCategory/{id}")
    public String deleteCategory(@PathVariable("id") String id){
        categoryService.delete(Integer.parseInt(id));
        return "redirect:/category";
    }

}
