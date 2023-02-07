package com.example.demo.service;

import com.example.demo.model.customer.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Service
public interface CustomerService {
    List<Customer> findAll();
    void add(Customer customer);
    void delete(Integer id);
    void update(Customer customer);
    Customer findById(Integer id);

}
