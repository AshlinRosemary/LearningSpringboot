package com.spring.core.DemoController;

import org.springframework.stereotype.Controller;

@Controller
public class DemoController {
    public String hello(){
        return "Hello Controller";
    }
}
