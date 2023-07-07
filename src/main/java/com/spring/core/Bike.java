package com.spring.core;

import org.springframework.stereotype.Component;

@Component("bike")
public class Bike implements Vehicle {
    @Override
    public void move(){
        System.out.println("com.spring.core.Bike is moving");
    }
}
