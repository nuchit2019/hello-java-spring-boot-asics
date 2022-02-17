package com.example.hello.tx;

import com.example.hello.User;
import com.example.hello.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class DemoTxService {
    @Autowired
    private UserRepository userRepository;


    public void callRepository() {
        step1();
        step2();
    }

    @Transactional
    public void step1() {
        User user1 = new User(1, "User 1");
        User user2 = new User(2, "User 2");
        User user3 = new User(3, "User 3");
        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
    }

    @Transactional
    public void step2() {
        User user4 = new User(4, "User 4");
        User user5 = new User(5, "User 5");
        User user6 = new User(6, "User 6");
        userRepository.save(user4);
        userRepository.save(user5);
        userRepository.save(user6);
    }

}
