package calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping({"","/caculator"})
public class CalculatorController {

    @RequestMapping("")
    public String displayHome(){
        return "home";
    }

    @PostMapping("/caculator")
    public String calculator(Model model ,String operation1 , String operation2 ,String operation){
        float op = Float.parseFloat(operation1);
        float op2 = Float.parseFloat(operation2);
        float result ;
        switch (operation){
            case "Addition":
                result = op+op2;
                model.addAttribute("result",result);
                return "home";
            case "Subtraction":
                result = op-op2;
                model.addAttribute("result",result);
                return "home";
            case "Multiplication":
                result = op*op2;
                model.addAttribute("result",result);
                return "home";
            case "Division":
                if (op == 0 || op2 == 0){
                    model.addAttribute("result","Khong the chia cho 0");
                    return "home";
                }
                result = op/op2;
                model.addAttribute("result",result);
                return "home";
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
    }
}
