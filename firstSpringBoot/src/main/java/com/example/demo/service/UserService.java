package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService { //interface bir kurallar dizini gibi düşünülebilir hem de okunulabilirliği kolaylaştırır

    public List<User> getAll();

    public User get(Long id);

    public String save(User user);

    public User update(User user);

    public String delete(Long id);
}
