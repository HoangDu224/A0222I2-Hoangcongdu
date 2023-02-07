package com.example.demo.service;

import com.example.demo.model.customer.Customer;
import com.example.demo.model.employee.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    void add(Employee employee);
    void delete(Integer id);
    void update(Employee employee);
    Employee findById(Integer id);
}
