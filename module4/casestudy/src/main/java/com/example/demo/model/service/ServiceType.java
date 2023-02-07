package com.example.demo.model.service;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ServiceType {
    @Id
    @GeneratedValue
    private Integer serviceTypeId;
    private String serviceTypeName;
    @OneToMany(mappedBy = "serviceType")
    private Set<Services> servicesSet;


    public ServiceType() {
    }

    public ServiceType(Integer serviceTypeId, String serviceTypeName) {
        this.serviceTypeId = serviceTypeId;
        this.serviceTypeName = serviceTypeName;
    }

    public Integer getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(Integer serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public void setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
    }
}
