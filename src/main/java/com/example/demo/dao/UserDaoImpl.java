package com.example.demo.dao;

import org.springframework.stereotype.Repository;
import jakarta.persistence.*;
import com.example.demo.model.User;

import java.util.List;
import java.util.Optional;

@Repository

public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    public void add(User user) {
        entityManager.persist(user);
    }

    public void update(User user) {
        entityManager.merge(user);
    }

    public void delete(Long id) {
        User user = entityManager.find(User.class, id);
        if (user != null) {
            entityManager.remove(user);
        }
    }

    public List<User> getAllUsers() {
        TypedQuery<User> query = entityManager.createQuery("SELECT u FROM users u", User.class);
        return query.getResultList();
    }

    public User findById(Long id) {
        return entityManager.find(User.class, id);
    }
}