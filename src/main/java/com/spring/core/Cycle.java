package com.spring.core;

import org.springframework.stereotype.Component;

@Component("cycle")
public class Cycle implements Vehicle {
    @Override
    public void move(){
        System.out.println("com.spring.core.Cycle is moving");
    }
}
