package com.spring.core.di;

public class Client {
    public static void main(String[] args) {

    String message="Hi Goodmorning";

    SMSService smsService=new SMSService();

    MessageSender messageSender=new MessageSender(smsService);
    messageSender.sendMessage(message);
    }
}
