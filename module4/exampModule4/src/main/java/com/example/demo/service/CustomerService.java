package com.example.demo.service;

import com.example.demo.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    void add(Customer customer);
    void delete(Integer id);
    void update(Customer customer);
    Customer findById(Integer id);
}
