package com.example.demo.controller;

import com.example.demo.model.AppsUser;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping({"","user"})
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping({"home",""})
    public String displayUser(Model model){
        model.addAttribute("list",userService.findAll());
        return "home";
    }
    @GetMapping("create")
    public String displayCreate(Model model){
        model.addAttribute("user",new AppsUser());
        return "add";
    }
    @PostMapping("create")
    public String doCreate(@Valid @ModelAttribute("user")AppsUser user , BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            return "add";
        }
        userService.add(user);
        return "redirect:home";
    }

}
