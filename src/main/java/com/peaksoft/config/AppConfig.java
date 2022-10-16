package com.peaksoft.config;

import com.peaksoft.model.Animal;
import com.peaksoft.model.Dog;
import com.peaksoft.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.peaksoft")
public class AppConfig {

    @Bean
    public Animal animal(){
        Dog dog = new Dog("pitbull",4);
        return dog;
    }
    @Bean
    public Timer timer(){
        return new Timer();
    }
}
