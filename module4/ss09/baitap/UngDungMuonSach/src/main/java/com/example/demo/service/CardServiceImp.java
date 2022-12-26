package com.example.demo.service;

import com.example.demo.model.TheMuonSach;
import com.example.demo.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CardServiceImp implements CardService {
    @Autowired
    CardRepository cardRepository;
    @Autowired
    BookService bookService;
    @Override
    public List<TheMuonSach> findAll() {
        return cardRepository.findAll();
    }

    @Override
    public TheMuonSach findById(int id) {
        return cardRepository.findById(id).orElse(null);
    }

    @Override
    public void update(TheMuonSach theMuonSach) {
        cardRepository.save(theMuonSach);
    }

    @Override
    public void delete(int id) {
        cardRepository.deleteById(id);
    }

    @Override
    public void add(TheMuonSach theMuonSach) {
        cardRepository.save(theMuonSach);
    }
}
