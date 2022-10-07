package com.example.thymeleaf_training.enums;

public enum Gender {

    FEMALE("Female"), MALE("Male");

    private final String value;

    Gender(String value) {
        this.value = value;
    }
}
