package com.example.demo.repository;

import com.example.demo.model.GiaoDich;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GiaoDichRepository extends JpaRepository<GiaoDich,Integer> {
    List<GiaoDich> findAllByServiceLike(String service);
    List<GiaoDich> findAllByCustomer_Name(String name);
//    @Query("select g FROM Giaodich g where g.)
//    List<GiaoDich> findAllCustomerAndService(String name , String service);
}
