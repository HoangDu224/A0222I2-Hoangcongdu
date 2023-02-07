package com.example.demo.model.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Position {
    @Id
    @GeneratedValue
    private Integer id;
    private String positionName;
    @OneToMany(mappedBy = "position")
    private Set<Employee> employeeSet;


    public Position() {
    }

    public Position(Integer id, String positionName) {
        this.id = id;
        this.positionName = positionName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
}
