package scan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import scan.repository.UserRepository;

@Controller
@RequestMapping({"/user",""})
public class ConfigController {
    @Autowired
    public UserRepository userRepository;
    @GetMapping("/Config")
    public String displayConfig(@RequestParam("id") String id, Model model){
        model.addAttribute("userConfig",userRepository.findById(Integer.parseInt(id)));
        return "setting";
    }

    @GetMapping({"/Display",""})
    public String displayUser(Model model) {
        model.addAttribute("userList",userRepository.findAll());
        return "user";
    }
}
