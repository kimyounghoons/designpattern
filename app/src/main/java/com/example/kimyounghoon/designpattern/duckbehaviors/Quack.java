package com.example.kimyounghoon.designpattern.duckbehaviors;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.print("꽥꽥소리\n");
    }
}
