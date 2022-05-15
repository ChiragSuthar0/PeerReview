package com.example.demo.Service.Impl;

import com.example.demo.Repository.UserRepository;
import com.example.demo.Service.userService;
import com.example.demo.entity.User;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {

    private UserRepository userRepo;

    private userServiceImpl(UserRepository userRepo) {
        super();
        this.userRepo = userRepo;
    }

    @Override
    public User getUserById(String rollNumber) {
        return userRepo.findById(rollNumber).get();
    }

    @Override
    public void deleteUserByUserName(String userName) {
        userRepo.deleteById(userName);
    }

    @Override
    public User getUserByUserName(String userName) {
        return userRepo.findByUserName(userName);
    }

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }
}
