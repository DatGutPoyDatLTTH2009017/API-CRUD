package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {
    public void saveUser(User user);
    public void deleteUser(Integer id);
    public User findById(Integer id);
    public List<User> findAll();
    public List<User> findAllByName(String name);
}
