package com.example.demo.model.employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

@Entity
public class AppsUser {
    @Id
    @Size(min = 5 , max = 45)
    private String userName;
    private String password;
    @OneToOne(mappedBy = "appsUser")
    private Employee employee;

    public AppsUser() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
