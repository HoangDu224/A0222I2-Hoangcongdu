package com.example.demo.repository;

import com.example.demo.model.contact.Contact;
import com.example.demo.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
    @Query("select co.customer FROM Contact co where co.customer.id != 'null'")
    List<Customer> findCustomer();
}
