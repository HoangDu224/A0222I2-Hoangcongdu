package com.example.demo.model.customer;

import com.example.demo.model.customer.Customer;

import javax.persistence.*;
import java.util.Set;

@Entity
public class CustomerType {
    @Id
    @GeneratedValue
    private Integer id;
    private String typeName;
    @OneToMany(mappedBy = "customerType")
    private Set<Customer> customerSet;

    public CustomerType() {
    }

    public CustomerType(Integer id, String typeName) {
        this.id = id;
        this.typeName = typeName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
