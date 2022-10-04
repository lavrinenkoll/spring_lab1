package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Order(2)
public class MySpringConsoleHelloWorldApplication implements CommandLineRunner {

    public static void main(String[] args) {
        System.out.println("Begin of main");
        SpringApplication.run(MySpringConsoleHelloWorldApplication.class, args);
        System.out.println("End of main");
    }

    public void run(String... args) throws Exception {
        System.out.println("Hello from Spring Boot!");
    }

}

@Component
@Order(1)
class First implements CommandLineRunner {

    public void run(String... args) throws Exception {
        System.out.println("First");
    }
}

@Component
@Order(3)
class Second implements CommandLineRunner {

    public void run(String... args) throws Exception {
        System.out.println("Second");
    }
}


