package com.example.demo.controller;

import com.example.demo.bookException.BookException;
import com.example.demo.model.Book;
import com.example.demo.model.TheMuonSach;
import com.example.demo.service.BookService;
import com.example.demo.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping({"","book"})
public class BookController {
    @Autowired
    BookService bookService;
    @Autowired
    CardService cardService;
    @Autowired
    MessageSource messageSource;
    @GetMapping({"","display"})
    public String displayBook (Model model){
        model.addAttribute("listBook",bookService.findAll());
        return "book";
    }
    @GetMapping({"muon/{id}"})
    public String showMuonSach(@PathVariable("id")int id,Model model){
        model.addAttribute("card",new TheMuonSach());
        model.addAttribute("sach",bookService.findbyId(id));
        return "muon";
    }
    @PostMapping("muon")
    public String doMuonSach(@ModelAttribute("card")TheMuonSach card) throws Exception{
        Book book = card.getBooks();
        int newQuantity = book.getQuantity()-1;
        if (newQuantity<0){
            throw new BookException("So luong sach = 0");
        }
        book.setQuantity(newQuantity);
        bookService.update(book);
        cardService.add(card);
        return "redirect:/display";
    }
    @GetMapping("danhsach")
    public String displayCard(Model model){
        model.addAttribute("card",cardService.findAll());
        return "card";
    }
    @GetMapping("trasach")
    public String showTraSach(){
        return "trasach";
    }
    @PostMapping("trasach")
    public String doTraSach(@RequestParam("idTraSach")int id) throws Exception{
        TheMuonSach theMuonSach = cardService.findById(id);
        if (theMuonSach!=null){
            Book book = theMuonSach.getBooks();
            int newQuantity = book.getQuantity()+1;
            book.setQuantity(newQuantity);
            bookService.update(book);
            cardService.delete(id);
        }else {
            throw new BookException("Ma tra sach khong ton tai");
        }
        return "redirect:/display";
    }
    @ExceptionHandler(Exception.class)
    public String errorHandler(Exception e, Model model) {
        model.addAttribute("message", e.getMessage());
        System.out.println("=============Book controller============");
        return "errorPage";
    }
}
