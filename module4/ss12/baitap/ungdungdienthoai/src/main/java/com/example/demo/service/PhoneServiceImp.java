package com.example.demo.service;

import com.example.demo.model.Phone;
import com.example.demo.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneServiceImp implements PhoneService {
    @Autowired
    PhoneRepository phoneRepository;

    @Override
    public List<Phone> findAll() {
        return phoneRepository.findAll();
    }

    @Override
    public Phone findbyId(Integer id) {
        return phoneRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Phone phone) {
        phoneRepository.save(phone);
    }

    @Override
    public void delete(Integer id) {
        phoneRepository.deleteById(id);
    }

    @Override
    public void update(Phone phone) {
        phoneRepository.save(phone);
    }
}
