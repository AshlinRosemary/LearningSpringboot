package com.spring.core;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {

       /* "Below code , has new keyword which creates a difficulty of creating new objects manually,
       this problem is solved by ApplicationContext Spring IOC container"
       Vehicle vehicle=new Bike();

        Traveler traveler=new Traveler(vehicle);
        traveler.startJourney();
        */


        //Creating SpringIOC container
        //Reads AppConfig (Beans & Configuration details)
        //Create and manage the Spring beans
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class) ;

        //Retrieve Spring bean
        Car car=applicationContext.getBean(Car.class);
        car.move();

        Bike bike=applicationContext.getBean(Bike.class);
        bike.move();

        Traveler traveler=applicationContext.getBean(Traveler.class);
        traveler.startJourney();
    }
}
