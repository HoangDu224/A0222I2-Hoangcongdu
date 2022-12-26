package com.example.demo.model;

import javax.persistence.*;

@Entity
public class TheMuonSach {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "idBook")
    Book books;

    public TheMuonSach() {
    }

    public TheMuonSach(int id, Book books) {
        this.id = id;
        this.books = books;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBooks() {
        return books;
    }

    public void setBooks(Book book) {
        this.books = book;
    }
}
