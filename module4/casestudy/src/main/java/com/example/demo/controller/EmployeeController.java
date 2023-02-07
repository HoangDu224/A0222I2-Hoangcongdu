package com.example.demo.controller;

import com.example.demo.model.customer.Customer;
import com.example.demo.model.employee.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping({"","displayEmployee"})
    public String displayEmployee(Model model){
        model.addAttribute("employeeList", employeeService.findAll());
        return "employee";
    }
    @GetMapping("createEmployee")
    public String showCreateEmployee(Model model){
        model.addAttribute("employee",new Employee());
        return "createEmployee";
    }
    @PostMapping("createEmployee")
    public String doCreateEmployee(@Valid @ModelAttribute("employee")Employee employee, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "createEmployee";
        }
        employeeService.add(employee);
        return "redirect:/employee";
    }
    @GetMapping("delete/{id}")
    public String doDeleteEmployee(@PathVariable("id")Integer id){
        employeeService.delete(id);
        return "redirect:/employee";
    }
    @GetMapping("edit/{id}")
    public String showEditEmployee(@PathVariable("id")Integer id,Model model){
        model.addAttribute("employee", employeeService.findById(id));
        return "editEmployee";
    }
    @PostMapping("editEmployee")
    public String doEditEmployee(@ModelAttribute("employee")Employee employee){
        employeeService.update(employee);
        return "redirect:/employee";
    }
}
