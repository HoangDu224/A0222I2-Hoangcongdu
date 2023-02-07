package com.example.demo.repository;

import com.example.demo.model.contact.Contact;
import com.example.demo.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {


}
