package com.klb.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan({"com.klb.config","com.klb.controller", "com.klb.service", "com.klb.config"})
@EntityScan("com.klb.entity")
@EnableMongoRepositories("com.klb.dao")
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
       // new com.com.klb.main.Application().configure(new SpringApplicationBuilder(com.com.klb.main.Application.class)).run(args);
    }
}