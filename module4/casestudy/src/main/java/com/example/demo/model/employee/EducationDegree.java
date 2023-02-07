package com.example.demo.model.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class EducationDegree {
    @Id
    @GeneratedValue
    private Integer id;
    private String educationDegreeName;
    @OneToMany(mappedBy = "educationDegree")
    private Set<Employee> employeeSet;

    public EducationDegree() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEducationDegreeName() {
        return educationDegreeName;
    }

    public void setEducationDegreeName(String educationDegreeName) {
        this.educationDegreeName = educationDegreeName;
    }
}
