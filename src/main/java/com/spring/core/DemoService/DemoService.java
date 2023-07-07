package com.spring.core.DemoService;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public String hello(){
        return "Hello DemoService";
    }
}
