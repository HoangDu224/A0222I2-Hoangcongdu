
package scan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import scan.model.UserConfig;
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

    @PostMapping("/Update")
    public String updateUser(Model model, @ModelAttribute("userConfig")UserConfig userConfig){
        if (userConfig.getSignature()==null){
            userConfig.setSignature("");
        }
        userRepository.updateUser(userConfig);
        return "redirect:/user/Display";
    }
}
