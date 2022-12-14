package codegym.vn.service;

import codegym.vn.bean.User;
import codegym.vn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void addUser(User user) {
        userRepository.create(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(int Id) {
        return userRepository.findById(Id);
    }

    public void updateLove(User user) {
        userRepository.updateLove(user);
    }
}
