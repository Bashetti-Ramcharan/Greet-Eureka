package com.example.greeteurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GreetEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreetEurekaClientApplication.class, args);
    }

}
