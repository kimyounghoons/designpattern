package com.example.kimyounghoon.designpattern.duckbehaviors;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.print("아무것도 하지 않음\n");
    }
}
