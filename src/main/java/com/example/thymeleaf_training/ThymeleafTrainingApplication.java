package com.example.thymeleaf_training;

import com.example.thymeleaf_training.bootstrap.DataGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ThymeleafTrainingApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ThymeleafTrainingApplication.class, args);
        DataGenerator bootStrap = context.getBean(DataGenerator.class);
        bootStrap.createUsers();
    }


}
