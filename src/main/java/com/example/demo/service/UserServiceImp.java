package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.models.User;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{
    private final UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    @Transactional
    public List<User> readAllUsers() {
        return userDao.readAllUsers();
    }

    @Override
    @Transactional
    public void create(User user) {
        userDao.create(user);
    }

    @Override
    public User findUser(Long id) {
        return userDao.findUser(id);
    }

    @Override
    @Transactional
    public User update(User user) {
       return userDao.update(user);
    }



    @Override
    @Transactional
    public void delete(Long id) {
        userDao.delete(id);
    }

}
