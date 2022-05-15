package com.example.demo.Service;

import com.example.demo.entity.User;

public interface userService {
    User getUserById(String rollNumber);
    void deleteUserByUserName(String userName);
    User getUserByUserName(String userName);
    User saveUser(User user);
}
