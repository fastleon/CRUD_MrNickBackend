package com.project.backend.service;

import com.project.backend.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    //Create
    public User createUser(User user);

    //Read all Users
    public List<User> getUsers();

    //Read Users by ID
    public User getUserByid(Long id);

    //delete
    public void deleteUser(Long id);

    //update
    public User updateUser(User user, Long id);


}
