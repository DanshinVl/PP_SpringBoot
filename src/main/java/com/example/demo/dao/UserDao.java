package com.example.demo.dao;
import jakarta.persistence.*;
import com.example.demo.model.User;


import java.util.List;

public interface UserDao {
    void add(User user);

    void update(User user);

    void delete(Long id);

    List<User> getAllUsers();

    User findById(Long id);
}
