package com.example.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int quantity;
    @OneToMany(mappedBy = "books")
    private Set<TheMuonSach> theMuonSach;

    public Book() {
    }

    public Book(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public Set<TheMuonSach> getTheMuonSach() {
        return theMuonSach;
    }

    public Book(int id, String name, int quantity, Set<TheMuonSach> theMuonSach) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.theMuonSach = theMuonSach;
    }

    public void setTheMuonSach(Set<TheMuonSach> theMuonSach) {
        this.theMuonSach = theMuonSach;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
