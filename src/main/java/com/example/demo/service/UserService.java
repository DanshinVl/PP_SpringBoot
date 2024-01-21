package com.example.demo.service;
import jakarta.persistence.*;
import com.example.demo.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    void update(User user);

    void delete(Long id);

    List<User> getAllUsers();
}
