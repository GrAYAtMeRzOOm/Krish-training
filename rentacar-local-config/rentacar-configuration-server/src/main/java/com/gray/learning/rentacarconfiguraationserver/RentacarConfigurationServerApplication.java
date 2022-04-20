package com.gray.learning.rentacarconfiguraationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RentacarConfigurationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentacarConfigurationServerApplication.class, args);
    }

}
