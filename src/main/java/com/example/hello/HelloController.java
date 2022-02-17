package com.example.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController //กำหนดยศ ให้ Class นี้้
public class HelloController {

    @Autowired
    private UserService userService;
    @GetMapping("/hello/{name}")
    public HelloResponse SayHi(@PathVariable String name) {

        return new HelloResponse(userService.concatData(name));
    }
}
