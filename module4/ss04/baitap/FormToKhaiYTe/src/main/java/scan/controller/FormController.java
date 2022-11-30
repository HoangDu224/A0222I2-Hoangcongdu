package scan.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import scan.model.ToKhai;

@Controller
@RequestMapping({"","/form"})
public class FormController {

    @GetMapping({"","/display"})
    public String displayForm(Model model){
        model.addAttribute("form",new ToKhai("","","","","","","","","","","","","","",""));
        return "home";
    }

    @PostMapping({"/add"})
    public String addForm(@ModelAttribute("form")ToKhai toKhai ){
        return "data";
    }
}
