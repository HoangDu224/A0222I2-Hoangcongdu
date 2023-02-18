package com.example.demo.service;

import com.example.demo.model.GiaoDich;

import java.util.List;

public interface GiaoDichService {
    List<GiaoDich> findAll();
    void add(GiaoDich giaoDich);
    void delete(Integer id);
    void update(GiaoDich giaoDich);
    GiaoDich findById(Integer id);
    List<GiaoDich> findAllByServiceLike(String service);
    List<GiaoDich> findAllByCustomer_Name(String name);
}
