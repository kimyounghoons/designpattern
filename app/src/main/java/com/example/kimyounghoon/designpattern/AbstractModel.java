package com.example.kimyounghoon.designpattern;

public class AbstractModel {
    String title;

    public AbstractModel(String title) {
        this.title = title;
    }

    protected void println(String content) {
        System.out.println(title+ " " + content);
    }
}
