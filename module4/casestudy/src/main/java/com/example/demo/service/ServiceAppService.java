package com.example.demo.service;

import com.example.demo.model.service.Services;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ServiceAppService {
    List<Services> findAll();
    void add(Services services);
    void delete(Integer id);
    void update(Services services);
    Services findById(Integer id);
}
