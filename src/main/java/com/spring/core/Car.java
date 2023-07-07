package com.spring.core;

import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
@Component("car")
public class Car implements Vehicle {
    @Override
    public void move(){

        System.out.println("com.spring.core.Car is moving");
    }
}
