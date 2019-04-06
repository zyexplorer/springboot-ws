package com.jdk.springbootws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringbootWsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWsApplication.class, args);
    }
}
