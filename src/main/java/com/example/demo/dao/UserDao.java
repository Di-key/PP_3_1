package com.example.demo.dao;

import com.example.demo.models.User;


import java.util.List;

public interface UserDao {
    List<User> readAllUsers();
    void create(User user);

    User update(User user);

    User findUser(Long id);

    void delete(Long id);
}
