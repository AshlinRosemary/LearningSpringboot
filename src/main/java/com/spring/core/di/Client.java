package com.spring.core.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {

    String message="Hi Goodmorning";

    //SMSService smsService=new SMSService();
    //EmailService emailService=new EmailService();
//Tight Coupling without dependency Injection --> Message Sender depends directly on Email Service or SMS service
        //By loose coupling i.e,by introducing Interface Message service class ,
        // there is no direct connection b/w Message sender class - SMSservice or EmailService
        // by changing parameter of MessageSender we can switch b/w EmailService & SmsService
    //MessageSender messageSender=new MessageSender(emailService);
    //messageSender.sendMessage(message);
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender messageSender =applicationContext.getBean(MessageSender.class);
        messageSender.sendMessage(message);
    }
}
