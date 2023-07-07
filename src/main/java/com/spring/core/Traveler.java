package com.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("traveler")
public class Traveler {
    /*com.spring.core.Car car;
    //why Constructor given (com.spring.core.Traveler)? Exception in thread "main" java.lang.NullPointerException: Cannot invoke "com.spring.core.Car.move()" because "this.car" is null
    //	at com.spring.core.Traveler.startJourney(com.spring.core.Traveler.java:7)
    //	at com.spring.core.Client.main(com.spring.core.Client.java:4)
    public com.spring.core.Traveler(){
        this.car=new com.spring.core.Car();
    }
    public void startJourney(){
        this.car.move();
    }*/

    private Vehicle vehicle;
    @Autowired
    public Traveler(@Qualifier("bike") Vehicle vehicle){

        this.vehicle=vehicle;
    }

    public void startJourney(){
        this.vehicle.move();
    }
}
