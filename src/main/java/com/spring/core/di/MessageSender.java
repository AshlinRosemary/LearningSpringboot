package com.spring.core.di;

public class MessageSender {

    private SMSService smsService;

    public MessageSender(SMSService smsService){
        this.smsService=smsService;
    }

    public void sendMessage(String message){
        this.smsService.sendMessage(message);
    }
}
