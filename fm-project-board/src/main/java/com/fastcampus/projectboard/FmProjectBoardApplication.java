package com.fastcampus.projectboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class FmProjectBoardApplication {
    public static void main(String[] args) {
        SpringApplication.run(FmProjectBoardApplication.class, args);
    }

}
