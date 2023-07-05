package com.spring.core;

import java.sql.SQLOutput;

public class Car implements Vehicle {
    @Override
    public void move(){
        System.out.println("com.spring.core.Car is moving");
    }
}
