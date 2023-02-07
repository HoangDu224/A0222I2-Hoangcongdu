package com.example.demo.service;

import com.example.demo.model.Phone;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface PhoneService {
    List<Phone> findAll();
    Phone findbyId(Integer id);
    void save(Phone phone);
    void delete(Integer id);
    void update(Phone phone);
}
