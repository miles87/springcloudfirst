package com.myproject.springcloudfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudfirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudfirstApplication.class, args);
    }

}

