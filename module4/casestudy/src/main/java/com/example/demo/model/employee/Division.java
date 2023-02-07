package com.example.demo.model.employee;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Division {
    @Id
    @GeneratedValue
    private Integer id;
    private String divisionName;
    @OneToMany(mappedBy = "division")
    private Set<Employee> employeeSet;


    public Division() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }
}
