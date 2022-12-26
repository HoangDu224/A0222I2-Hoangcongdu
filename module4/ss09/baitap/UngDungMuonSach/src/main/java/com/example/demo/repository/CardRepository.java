package com.example.demo.repository;

import com.example.demo.model.TheMuonSach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<TheMuonSach,Integer> {
}
