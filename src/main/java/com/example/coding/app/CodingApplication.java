package com.example.coding.app;

import com.example.coding.process.ExtensionCounter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CodingApplication {
    Logger logger = LoggerFactory.getLogger(CodingApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(CodingApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        logger.info("Initiating Coding Application");
        return args -> ExtensionCounter.processExtensions("src/main/resources/log.jsonl");
    }

}

