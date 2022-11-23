package chuyendoi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;

@Controller
@RequestMapping({"/convert",""})
public class ConvertServlet {
    @GetMapping("")
    public String displayCovert() {
        return "home";
    }

    @PostMapping("/convert")
    public String displayResult(Model model, @RequestParam("usd") String usd) {
        float vnd = Integer.parseInt(usd) * 24000;
        model.addAttribute("vnd", vnd);
        return "home";
    }
}
