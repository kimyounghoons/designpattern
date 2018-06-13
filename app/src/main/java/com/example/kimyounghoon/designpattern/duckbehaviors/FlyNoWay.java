package com.example.kimyounghoon.designpattern.duckbehaviors;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.print("날수 없음\n");
    }
}
