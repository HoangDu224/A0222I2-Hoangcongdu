package com.example.demo.model;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class GiaoDich {
    @Id
    @GeneratedValue
    private Integer id;
    private String date;
    @Min( value = 500000 , message = "{price.validate}")
    private int price;
    @NotEmpty(message = "{null.validate}" )
    private String service;
    @Min( value = 20 , message = "{area.validate}")
    private int area;
    @NotNull(message = "{null.validate}")
    @ManyToOne
    @JoinColumn(name = "khachhang")
    Customer customer;

    public GiaoDich() {
    }

    public GiaoDich(Integer id, String date, int price, int area) {
        this.id = id;
        this.date = date;
        this.price = price;
        this.area = area;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public GiaoDich(Integer id, String date, int price, String service, int area, Customer customer) {
        this.id = id;
        this.date = date;
        this.price = price;
        this.service = service;
        this.area = area;
        this.customer = customer;
    }

    public GiaoDich(Integer id, String date, int price, int area, Customer customer) {
        this.id = id;
        this.date = date;
        this.price = price;
        this.area = area;
        this.customer = customer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
