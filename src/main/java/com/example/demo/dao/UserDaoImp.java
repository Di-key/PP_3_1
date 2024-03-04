package com.example.demo.dao;

import com.example.demo.models.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao{
    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<User> readAllUsers() {
        return manager.createQuery("from User", User.class).getResultList();
    }
    @Override
    public void create(User user) {
        manager.persist(user);
    }

    @Override
    public User update(User user) {

         return manager.merge(user);
    }


    @Override
    public User findUser(Long id) {
        return manager.find(User.class, id);
    }

    @Override
    public void delete(Long id) {
        User user = manager.find(User.class, id);
        manager.remove(user);
    }
}