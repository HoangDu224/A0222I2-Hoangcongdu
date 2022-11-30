package Upload.controller;

import Upload.model.Music;
import Upload.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("")
public class MusicController {
@Autowired
    MusicRepository musicRepository;


    @GetMapping({"/display",""})
    public String display(Model model){
        model.addAttribute("musicList",musicRepository.findAll());
        return "home";
    }
    @GetMapping("/upLoad")
    public String upload(Model model){
        model.addAttribute("music",new Music());
        return "upLoadMusic";
    }
    @PostMapping("/upLoad")
    public String saveMusic(@ModelAttribute("music")Music music, RedirectAttributes redirectAttributes){
        musicRepository.save(music);
//        redirectAttributes.addFlashAttribute("msg"," Thêm mới thành công");
        return "redirect:/display";
    }
}
