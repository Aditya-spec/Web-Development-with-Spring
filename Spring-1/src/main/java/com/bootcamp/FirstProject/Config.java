package com.bootcamp.FirstProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
@Controller
public class Config {
    @Bean
    public String returnName() {
        return "Aditya";
    }
}
