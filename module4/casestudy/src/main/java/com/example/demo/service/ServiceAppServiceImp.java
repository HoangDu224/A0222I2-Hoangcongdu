package com.example.demo.service;

import com.example.demo.model.service.Services;
import com.example.demo.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceAppServiceImp implements ServiceAppService {
    @Autowired
    ServiceRepository serviceRepository;
    @Override
    public List<Services> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public void add(Services services) {
        serviceRepository.save(services);
    }

    @Override
    public void delete(Integer id) {
        serviceRepository.deleteById(id);
    }

    @Override
    public void update(Services services) {
        serviceRepository.save(services);
    }
    @Override
    public Services findById(Integer id) {
        return serviceRepository.findById(id).orElse(null);
    }
}

