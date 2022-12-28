package com.example.demo.controller;

import com.example.demo.model.Cart;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("cart")
public class CartController {
//    @ModelAttribute("cart")
//    public Cart setupCart() {
//       return new Cart();
//    }
    Cart cart = new Cart();
    @Autowired
    ProductService productService;
    @GetMapping("/Show-Cart")
    public String showCart(Model model) {
        model.addAttribute("cart",cart);
        return "cart";
    }
    @GetMapping("/addProduct/{id}")
    public String addProduct(@PathVariable("id") int id){
        cart.addProduct(productService.findById(id));
        return "redirect:/display";
    }
}
