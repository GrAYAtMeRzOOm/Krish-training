package com.gray.alphagen.instabot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class InstaBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(InstaBotApplication.class, args);
    }

}
