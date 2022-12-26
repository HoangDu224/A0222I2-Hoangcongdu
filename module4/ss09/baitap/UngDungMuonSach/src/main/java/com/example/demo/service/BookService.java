package com.example.demo.service;

import com.example.demo.model.Book;

import java.util.List;

public interface BookService  {
    List<Book> findAll();
    Book findbyId(int id);
    void update(Book book);
    void add (Book book);
    void delete(int id);
}
