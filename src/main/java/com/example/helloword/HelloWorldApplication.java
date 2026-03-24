package com.example.helloword;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelloWorldApplication {

    private AccountService accountService;

    public HelloWorldApplication(AccountService accountService) {
        this.accountService = accountService;
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext context) {
        return args -> {
            System.out.println("===> Hello World from CommandLineRunner...");
            accountService.save();
        };
    }

}
