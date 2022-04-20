package com.gray.learning.localconfig.rentacarconfigcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RentacarConfigCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentacarConfigCloudApplication.class, args);
    }

}
