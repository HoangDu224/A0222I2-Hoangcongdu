package com.example.demo.service;

import com.example.demo.model.AppsUser;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public List<AppsUser> findAll() {
        return userRepository.findAll();
    }

    @Override
    public AppsUser findById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void add(AppsUser appsUser) {
        userRepository.save(appsUser);
    }

    @Override
    public void delete(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public void update(AppsUser appsUser) {
        userRepository.save(appsUser);
    }
}
