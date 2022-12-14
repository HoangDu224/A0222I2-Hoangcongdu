package codegym.vn.controller;

import codegym.vn.bean.User;
import codegym.vn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping({"","/user"})
public class HomeController {
    @Autowired
    private UserService userService;

    @GetMapping({"","/display"})
    public String displayHome(Model model) {
        model.addAttribute("user",new User());
        model.addAttribute("userList", userService.findAll());
        return "home";
    }

    @PostMapping("/create")
    public String createUser(@ModelAttribute User user){
        userService.addUser(user);
        return "redirect:/display";
    }
    @GetMapping("/updatelike/{id}")
    public String updateLove(@PathVariable("id")int id ){
        User user = userService.findById(id);
        int loveUpdate = userService.findById(id).getLove()+1;
        user.setLove(loveUpdate);
        userService.updateLove(user);
        return "redirect:/display";
    }
}
