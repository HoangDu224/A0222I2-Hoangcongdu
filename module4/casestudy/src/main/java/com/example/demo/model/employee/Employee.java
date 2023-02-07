package com.example.demo.model.employee;

import com.example.demo.model.contact.Contact;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.Set;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String birthday;
    private String idCard;
    @Min( value = 0 , message = "{salary.validate}")
    private Double salary;
    private String phone;
    private String email;
    private String address;
    @ManyToOne
    @JoinColumn(name = "idDivision")
    Division division;
    @ManyToOne
    @JoinColumn(name = "idEducation")
    EducationDegree educationDegree;
    @ManyToOne
    @JoinColumn(name = "idPosition")
    Position position;
    @OneToOne
    @JoinColumn(name = "userName")
    AppsUser appsUser;
    @OneToMany(mappedBy = "employee")
    Set<Contact> contactSet;

    public Employee() {
    }

    public Employee(Integer id, String name, String birthday, String idCard, Double salary, String phone, String email, String address, Division division, EducationDegree educationDegree, Position position) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.idCard = idCard;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.division = division;
        this.educationDegree = educationDegree;
        this.position = position;
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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
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

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
