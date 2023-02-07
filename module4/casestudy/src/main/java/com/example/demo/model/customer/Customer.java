package com.example.demo.model.customer;

import com.example.demo.model.contact.Contact;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String birthday;
    private boolean gender;
    @Pattern(regexp = "^/d{9}|/d{12}$", message = "{idCard.validate}")
    private String idCard;
    @Pattern(regexp = "^[0][9][0|1][\\d]{7}+$", message = "{phone.validate}")
    private String phone;
    @Pattern(regexp = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$", message = "{email.validate}")
    private String email;
    private String address;
    @ManyToOne
    @JoinColumn(name = "customerType")
    CustomerType customerType;
    @OneToMany(mappedBy = "customer")
    Set<Contact> contactSet;

    public Customer() {
    }

    public Customer(Integer id, String name, String birthday, boolean gender, String idCard, String phone, String email, String address, CustomerType customerType) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}
