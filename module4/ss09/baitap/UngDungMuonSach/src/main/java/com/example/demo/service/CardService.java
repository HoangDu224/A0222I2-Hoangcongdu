package com.example.demo.service;

import com.example.demo.model.TheMuonSach;

import java.util.List;

public interface CardService {
    List<TheMuonSach> findAll();
    TheMuonSach findById(int id);
    void update (TheMuonSach theMuonSach);
    void delete(int id);
    void add (TheMuonSach theMuonSach);
}
