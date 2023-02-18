package com.example.demo.service;

import com.example.demo.model.GiaoDich;
import com.example.demo.repository.GiaoDichRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GiaoDichServiceImp implements GiaoDichService {
    @Autowired
    GiaoDichRepository giaoDichRepository;
    @Override
    public List<GiaoDich> findAll() {
        return giaoDichRepository.findAll();
    }

    @Override
    public void add(GiaoDich giaoDich) {
        giaoDichRepository.save(giaoDich);
    }

    @Override
    public void delete(Integer id) {
        giaoDichRepository.deleteById(id);
    }

    @Override
    public void update(GiaoDich giaoDich) {
        giaoDichRepository.save(giaoDich);
    }

    @Override
    public GiaoDich findById(Integer id) {
        return giaoDichRepository.findById(id).orElse(null);
    }

    @Override
    public List<GiaoDich> findAllByServiceLike(String service) {
        return giaoDichRepository.findAllByServiceLike(service);
    }

    @Override
    public List<GiaoDich> findAllByCustomer_Name(String name) {
        return giaoDichRepository.findAllByCustomer_Name(name);
    }
}
