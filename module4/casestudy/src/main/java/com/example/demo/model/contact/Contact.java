package com.example.demo.model.contact;

import com.example.demo.model.customer.Customer;
import com.example.demo.model.employee.Employee;
import com.example.demo.model.service.Services;
import com.example.demo.service.ServiceAppService;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.Set;

@Entity
public class Contact {
    @Id
    @GeneratedValue
    private Integer id;
    private String startDate;
    private String endDate;
    @Min( value = 0 , message = "{deposit.validate}")
    private Double deposit;
    @Min( value = 0 , message = "{totalmoney.validate}")
    private Double totalMoney;
    @ManyToOne
    @JoinColumn(name = "employeeId")
    Employee employee;
    @ManyToOne
    @JoinColumn(name = "customerId")
    Customer customer;
    @ManyToOne
    @JoinColumn(name = "services")
    Services services;
    @OneToOne(mappedBy = "contact")
    ContactDetail contactDetail;

    public Contact() {
    }

    public Contact(Integer id, String startDate, String endDate, Double deposit, Double totalMoney) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deposit = deposit;
        this.totalMoney = totalMoney;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public ContactDetail getContactDetail() {
        return contactDetail;
    }

    public void setContactDetail(ContactDetail contactDetail) {
        this.contactDetail = contactDetail;
    }
}
