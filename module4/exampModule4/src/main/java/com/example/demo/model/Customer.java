package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String phone;
    private String email;
    @OneToMany(mappedBy = "customer")
    Set<GiaoDich> giaoDichSet;

    public Set<GiaoDich> getGiaoDichSet() {
        return giaoDichSet;
    }

    public void setGiaoDichSet(Set<GiaoDich> giaoDichSet) {
        this.giaoDichSet = giaoDichSet;
    }

    public Customer() {
    }

    public Customer(Integer id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
