package com.example.demo.controller;

import com.example.demo.model.contact.Contact;
import com.example.demo.model.customer.Customer;
import com.example.demo.model.employee.Employee;
import com.example.demo.service.ContactService;
import com.example.demo.service.CustomerService;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.ServiceAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("contact")
public class ContactController {
    @Autowired
    ContactService contactService;
    @Autowired
    ServiceAppService serviceAppService;
    @Autowired
    CustomerService customerService;
    @Autowired
    EmployeeService employeeService;
    @GetMapping({"","displayContact"})
    public String displayContact(Model model){
        model.addAttribute("contactList", contactService.findAll());
        return "contact";
    }
    @GetMapping("createContact")
    public String showCreateContact(Model model){
        model.addAttribute("contact",new Contact());
        model.addAttribute("customerList",customerService.findAll());
        model.addAttribute("employeeList",employeeService.findAll());
        model.addAttribute("serviceList",serviceAppService.findAll());
        return "createContact";
    }
    @PostMapping("createContact")
    public String doCreateContact(@Valid @ModelAttribute("contact") Contact contact, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "createContact";
        }
        contactService.add(contact);
        return "redirect:/contact";
    }
    @GetMapping({"delete","delete/{id}"})
    public String doDeleteContact(@PathVariable("id")Integer id){
        contactService.delete(id);
        return "redirect:/contact";
    }
    @GetMapping("edit/{id}")
    public String showEditContact(@PathVariable("id")Integer id,Model model){
        model.addAttribute("contact", contactService.findById(id));
        model.addAttribute("customerList",customerService.findAll());
        model.addAttribute("employeeList",employeeService.findAll());
        model.addAttribute("serviceList",serviceAppService.findAll());
        return "editContact";
    }
    @PostMapping("editContact")
    public String doEditContact(@ModelAttribute("contact")Contact contact){
        contactService.update(contact);
        return "redirect:/contact";
    }
    @GetMapping("displayCustomerHaveContact")
    public String displayCustomerHaveContact(Model model){
        model.addAttribute("customerList",contactService.findCustomer());
        return "customer";
    }
}
