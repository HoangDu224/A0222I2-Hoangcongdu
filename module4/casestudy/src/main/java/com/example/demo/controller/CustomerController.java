package com.example.demo.controller;

import com.example.demo.model.customer.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping({"customer"})
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping({"","displayCustomer"})
    public String displayCustomer(Model model){
        model.addAttribute("customerList",customerService.findAll());
        return "customer";
    }
    @GetMapping("createCustomer")
    public String showCreateCustomer(Model model){
        model.addAttribute("customer",new Customer());
        return "createCustomer";
    }
    @PostMapping("createCustomer")
    public String doCreateCustomer(@Valid @ModelAttribute("customer")Customer customer, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "createCustomer";
        }
        customerService.add(customer);
        return "redirect:/customer";
    }
    @GetMapping({"delete"})
    public String doDeleteCustomer(@RequestParam("id") Integer id){
        customerService.delete(id);
        return "redirect:/customer";
    }
    @GetMapping("edit/{id}")
    public String showEditCustomer(@PathVariable("id")Integer id,Model model){
        model.addAttribute("customer",customerService.findById(id));
        return "editCustomer";
    }
    @PostMapping("editCustomer")
    public String doEditCustomer(@ModelAttribute("customer")Customer customer){
        customerService.update(customer);
        return "redirect:/customer";
    }

}
