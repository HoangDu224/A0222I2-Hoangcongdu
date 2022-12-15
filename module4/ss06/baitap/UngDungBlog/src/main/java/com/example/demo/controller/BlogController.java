package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping({"","blog"})
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping({"","home"})
    public String displayBlog(Model model){
        model.addAttribute("list",blogService.findAll());
        return "home";
    }
    @GetMapping("create")
    public String showCreate(Model model){
        model.addAttribute("Blog",new Blog());
        return "create";
    }
    @PostMapping("create")
    public String doCreate(@Valid @ModelAttribute("Blog")Blog blog, BindingResult bindingResult,Model model){
        blogService.add(blog);
        return "redirect:/home";
    }
    @GetMapping("edit/{id}")
    public String showEdit(@PathVariable("id")int id, Model model){
        model.addAttribute("Blog", blogService.findById(id));
        return "edit";
    }
    @PostMapping("edit")
    public String doEdit(@Valid @ModelAttribute("Blog")Blog blog ,BindingResult bindingResult){
        blogService.update(blog);
        return "redirect:/home";
    }
    @GetMapping("delete/{id}")
    public String doDelete(@PathVariable("id")int id ){
        blogService.delete(id);
        return "redirect:/home";
    }
    @GetMapping("detail/{id}")
    public String showDetail(@PathVariable("id")int id , Model model){
         model.addAttribute("Blog",blogService.findById(id));
         return "detail";

    }

}
