package com.example.demo.service;

import com.example.demo.model.contact.Contact;
import com.example.demo.model.customer.Customer;
import com.example.demo.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImp implements ContactService {
    @Autowired
    ContactRepository contactRepository;
    @Override
    public List<Contact> findAll() {
        return contactRepository.findAll();
    }

    @Override
    public void add(Contact contact) {
        contactRepository.save(contact);
    }

    @Override
    public void delete(Integer id) {
        contactRepository.deleteById(id);
    }

    @Override
    public void update(Contact contact) {
        contactRepository.save(contact);
    }

    @Override
    public Contact findById(Integer id) {
        return contactRepository.findById(id).orElse(null);
    }

    @Override
    public List<Customer> findCustomer() {
        return contactRepository.findCustomer();
    }
}
