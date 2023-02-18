package com.example.demo.controller;

import com.example.demo.model.GiaoDich;
import com.example.demo.service.CustomerService;
import com.example.demo.service.GiaoDichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.model.IModel;

import javax.validation.Valid;

@Controller
@RequestMapping("giaodich")
public class GiaoDichController {
    @Autowired
    GiaoDichService giaoDichService;
    @Autowired
    CustomerService customerService;
    @GetMapping({"","displayGiaoDich"})
    public String displayGiaoDich(Model model){
        model.addAttribute("giaodichList", giaoDichService.findAll());
        return "giaoDich";
    }
    @GetMapping("createGiaoDich")
    public String showCreateGiaoDich(Model model){
        model.addAttribute("giaoDich",new GiaoDich());
        model.addAttribute("customerList",customerService.findAll());
        return "createGiaoDich";
    }
    @PostMapping("createGiaoDich")
    public String doCreateGiaoDich(@Valid@ModelAttribute("giaoDich")GiaoDich giaoDich,BindingResult bindingResult,Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("customerList",customerService.findAll());
            return "createGiaoDich";
        }
        giaoDichService.add(giaoDich);
        return "redirect:/giaodich";
    }
    @GetMapping({"delete"})
    public String doDeleteGiaoDich(@RequestParam("id") Integer id){
        giaoDichService.delete(id);
        return "redirect:/giaodich";
    }
    @GetMapping("edit/{id}")
    public String showEditGiaoDich(@PathVariable("id")Integer id,Model model){
        model.addAttribute("giaoDich", giaoDichService.findById(id));
        return "editGiaoDich";
    }
    @PostMapping("editGiaoDich")
    public String doEditGiaoDich(@ModelAttribute("giaoDich")GiaoDich giaoDich){
        giaoDichService.update(giaoDich);
        return "redirect:/giaodich";
    }
    @GetMapping("chitiet/{id}")
    public String showChiTiet(@PathVariable("id")Integer id, Model model){
        model.addAttribute("giaodich",giaoDichService.findById(id));
        return "chitiet";
    }
    @GetMapping("timkiem")
    public String doTimKiem(@RequestParam("nameSearch")String name,@RequestParam("service")String service,Model model){
        if ("".equals(name) & "".equals(service)){
            model.addAttribute("giaodichList",giaoDichService.findAll());
            return "giaodich";
        }else if ("".equals(name)){
            model.addAttribute("giaodichList",giaoDichService.findAllByServiceLike(service));
            return "giaodich";
        }else if ("".equals(service)){
            model.addAttribute("giaodichList",giaoDichService.findAllByCustomer_Name(name));
            return "giaodich";
        }else {
            return "giaodich";
        }
    }

}
