package com.example.demo.controller;

import com.example.demo.model.customer.Customer;
import com.example.demo.model.service.Services;
import com.example.demo.service.ServiceAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("service")
public class ServiceController {
    @Autowired
    ServiceAppService serviceAppService;
    @GetMapping({"","displayService"})
    public String displayService(Model model){
        model.addAttribute("serviceList", serviceAppService.findAll());
        return "service";
    }
    @GetMapping("createService")
    public String showCreateService(Model model){
        model.addAttribute("service",new Services());
        return "createService";
    }
    @PostMapping("createService")
    public String doCreateService(@Valid @ModelAttribute("service")Services services, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "createService";
        }
        serviceAppService.add(services);
        return "redirect:/service";
    }
    @GetMapping("delete/{id}")
    public String doDeleteService(@PathVariable("id")Integer id){
        serviceAppService.delete(id);
        return "redirect:/service";
    }
    @GetMapping("edit/{id}")
    public String showEditService(@PathVariable("id")Integer id,Model model){
        model.addAttribute("service", serviceAppService.findById(id));
        return "editService";
    }
    @PostMapping("editService")
    public String doEditCustomer(@ModelAttribute("service")Services services){
        serviceAppService.update(services);
        return "redirect:/service";
    }
}


