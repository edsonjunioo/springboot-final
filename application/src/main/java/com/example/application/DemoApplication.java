package com.example.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.example.application"})
@EntityScan(basePackages = {"com.example.domain"})
@ComponentScan(basePackages = {})
public class DemoApplication {
    public static void main(String[] args){
        SpringApplication.run(SpringApplication.class);

    }
}
