package sandwich.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping({"/sandwich",""})
public class SandwichController {

    @RequestMapping({"","/display"})
    public String displayHome(){
        return "home";
    }

    @PostMapping("/option")
    public String getOption(Model model, @RequestParam("Condiment") String[] condiment){
        model.addAttribute("condimentList",condiment);
        return "home";
    }
}
