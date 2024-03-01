package com.example.demo.service;



import com.example.demo.models.User;

import java.util.List;

public interface UserService {
    List<User> readAllUsers();
    void create(User user);
    User update(User user);

    public User findUser(Long id);

    void delete(Long id);
}
