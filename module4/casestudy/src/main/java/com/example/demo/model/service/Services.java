package com.example.demo.model.service;

import com.example.demo.model.contact.Contact;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.constraints.Min;
import java.util.Set;

@Entity
public class Services {
    @Id
    @GeneratedValue
    private Integer serviceId;
    private String serviceName;
    private int serviceArea;
    private int serviceMaxPeople;
    private String stardardRoom;
    private String decription;
    private Double poolArea;
    @Min( value = 0 , message = "{floor.validate}")
    private int numberFloor;
    @OneToMany(mappedBy = "services")
    Set<Contact> contact;
    @ManyToOne
    @JoinColumn(name = "rentType")
    RentType rentType;
    @ManyToOne
    @JoinColumn(name = "serviceType")
    ServiceType serviceType;

    public Services() {
    }

    public Services(Integer serviceId, String serviceName, int serviceArea, int serviceMaxPeople, String stardardRoom, String decription, Double poolArea, int numberFloor) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.serviceMaxPeople = serviceMaxPeople;
        this.stardardRoom = stardardRoom;
        this.decription = decription;
        this.poolArea = poolArea;
        this.numberFloor = numberFloor;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(int serviceArea) {
        this.serviceArea = serviceArea;
    }

    public int getServiceMaxPeople() {
        return serviceMaxPeople;
    }

    public void setServiceMaxPeople(int serviceMaxPeople) {
        this.serviceMaxPeople = serviceMaxPeople;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public String getStardardRoom() {
        return stardardRoom;
    }

    public void setStardardRoom(String stardardRoom) {
        this.stardardRoom = stardardRoom;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public Double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }
}
