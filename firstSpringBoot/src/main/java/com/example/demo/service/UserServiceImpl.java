package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //bu classın bir servis classı olduğunu tanımlar ve app ayağa kalkarken direk bu classı oluşturur
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User get(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }

    @Override
    public String save(User user) {
        User user2 = userRepository.save(user);
        if(user2 != null){
            return "User saved!";
        }
        return "User not saved!";
    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public String delete(Long id) {
        userRepository.deleteById(id);
        return "User deleted!";
    }

}
