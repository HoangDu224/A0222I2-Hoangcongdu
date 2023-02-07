package com.example.demo.service;


import com.example.demo.model.contact.Contact;
import com.example.demo.model.customer.Customer;

import java.util.List;

public interface ContactService {
    List<Contact> findAll();
    void add(Contact contact);
    void delete(Integer id);
    void update(Contact contact);
    Contact findById(Integer id);
    List<Customer> findCustomer();
}
