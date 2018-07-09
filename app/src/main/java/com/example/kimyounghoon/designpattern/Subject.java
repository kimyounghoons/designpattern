package com.example.kimyounghoon.designpattern;

public class Subject {
    private String name;

    public Subject(String name) {
        this.name = name;
        System.out.println("create "+ name);
    }
}
