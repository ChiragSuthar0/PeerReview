package com.example.demo;

import com.example.demo.Repository.ReviewResultRepository;
import com.example.demo.Repository.UserRepository;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class Demo1Application implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private ReviewResultRepository reviewResultRepo;

    @Override
    public void run(ApplicationArguments args) throws Exception {

//        reviewResultRepo.deleteAll();


//        User user = new User("19BIT022", "Chirag", "Suthar", "password", "sutharchirag128@gmail.com", "+919428898240");
//        user.setPassword(encoder.encode(user.getPassword()));
//        userRepo.save(user);
//        User user1 = new User("19BIT021", "Brijesh", "Kavar", "password", "brijeshkavar@gmail.com", "+919428898240");
//        user1.setPassword(encoder.encode(user1.getPassword()));
//        userRepo.save(user1);
    }
}
