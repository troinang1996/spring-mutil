package com.laptrinh;

import laptrinh.controller.User.CategoryControllerRollUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan(basePackages = {"com.laptrinh.config", "laptrinh.controller.User"
}, basePackageClasses = {CategoryControllerRollUser.class})


public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }
}
