package scan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import scan.model.Product;
import scan.repository.ProductRepository;

@Controller
@RequestMapping({"/product",""})
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping({"/display",""})
    public String displayProduct(Model model){
        model.addAttribute("productList",productRepository.findAll());
        return "home";
    }
    @GetMapping({"/delete"})
    public String deleteProduct(@RequestParam("id") String id){
        productRepository.deleteProductById(Integer.parseInt(id));
        return "redirect:/product/display";
    }
    @GetMapping("/update")
    public String showUpdate(@RequestParam("id") String id,Model model){
        model.addAttribute("product",productRepository.findById(Integer.parseInt(id)));
        return "update";
    }
    @PostMapping("/update")
    public String updateProduct (Model model, @ModelAttribute("product")Product product){
        productRepository.deleteProductById(Integer.parseInt(String.valueOf(product.getId())));
        productRepository.addProduct(product);
        return "redirect:/product/display";
    }
    @GetMapping("/add")
    public String showAdd(Model model){
        model.addAttribute("product",new Product());
        return "add";
    }
    @PostMapping("/add")
    public String AddProduct(@ModelAttribute("product")Product product){
        productRepository.addProduct(product);
        return "redirect:/product/display";
    }
    @GetMapping("/search")
    public String searchProduct(@RequestParam("search") String searchName,Model model){
        model.addAttribute("productList",productRepository.findByName(searchName));
        return "home";

    }
}
