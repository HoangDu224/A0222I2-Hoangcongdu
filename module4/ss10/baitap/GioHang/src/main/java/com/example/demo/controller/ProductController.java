package com.example.demo.controller;

import com.example.demo.model.Cart;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping({"product",""})
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping({"display",""})
    public String findAll(Model model, @CookieValue(name = "count",defaultValue = "0")Long count, HttpServletResponse response){
        Cookie cookie = new Cookie("count", ++count +"");
        cookie.setPath("/");
        cookie.setMaxAge(60);
        response.addCookie(cookie);
        model.addAttribute("listProduct",productService.findAll());
        model.addAttribute("count",count);
        return "product";
    }
}
