package com.jakubspiewak.ashdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AshDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AshDiscoveryServiceApplication.class, args);
    }

}
