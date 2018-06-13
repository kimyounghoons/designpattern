package com.example.kimyounghoon.designpattern.duckbehaviors;

public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.print("고무 오리가 내는 삑삑 소리\n");
    }
}
