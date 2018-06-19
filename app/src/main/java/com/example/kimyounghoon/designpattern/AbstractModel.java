package com.example.kimyounghoon.designpattern;

public class AbstractModel {
    String location;

    public AbstractModel(String location) {
        this.location = location;
    }

    protected void println(String content) {
        System.out.println(location+ " " + content);
    }
}
