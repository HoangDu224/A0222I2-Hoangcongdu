package service;

import model.Sach;
import repository.SachRepository;

import java.util.List;

public class SachService {
    SachRepository sachRepository = new SachRepository();
    public List<Sach> findAll(){
        return sachRepository.findAll();
    }
}
