package com.shashank.micro.serviceonemicro.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ServiceOneConfiguration {

    @Autowired
    private Environment environment;

    public String getGreetingMessage() {
        return environment.getProperty("my.greeting.message");
    }
}
