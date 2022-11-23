package tudien.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tudien.repository.TuDien;

@Controller
@RequestMapping({"/tudien", ""})
public class TuDienServlet {
    @Autowired
    TuDien tuDien ;
    @RequestMapping({"", "/display"})
    public String displayHome() {
        return "home";
    }

    @GetMapping("/search")
    public String search(Model model,String key){
        model.addAttribute("key", tuDien.search(key));
        return "home" ;
    }
}