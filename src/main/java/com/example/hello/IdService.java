package com.example.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class IdService {
    @Autowired//เป็นการเชื่อมต่อ...หรือเข้าไปดึง Instance ที่ถูกสร้างใน Spring container โดยอัตโนมัติ
    private NumberGenerator numberGenerator;

    public String generator() {

        String id = "HELLO " + numberGenerator.get();
        return id;
    }
}

@Component
class NumberGenerator{
    public int get(){
        return new Random().nextInt(10);

    }
}