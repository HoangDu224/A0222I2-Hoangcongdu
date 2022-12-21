package com.example.demo.service;

import com.example.demo.model.AppsUser;

import java.util.List;

public interface UserService {
    List<AppsUser> findAll();
    AppsUser findById(int id);
    void add(AppsUser appsUser);
    void delete(int id);
    void update(AppsUser appsUser);
}
