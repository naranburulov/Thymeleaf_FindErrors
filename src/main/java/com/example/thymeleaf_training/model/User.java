package com.example.thymeleaf_training.model;

import com.example.thymeleaf_training.enums.Gender;
import com.example.thymeleaf_training.enums.State;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    private String firstName;
    private String lastName;
    private String address;
    private State state;
    private int age;
    private Gender gender;
    private boolean married;



}
