package com.shashank.micro.serviceonemicro.controller;

import com.shashank.micro.serviceonemicro.model.ServiceOneConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceOneController {
    @Autowired
    private ServiceOneConfiguration serviceOneConfiguration;

    @RequestMapping("/getGreetingMessage")
    public String getGreetingMessage() {
        return serviceOneConfiguration.getGreetingMessage();
    }

    @RequestMapping("/getConfig")
    public ServiceOneConfiguration getConfig() {
        return serviceOneConfiguration;
    }
}
