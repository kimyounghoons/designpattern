package com.example.kimyounghoon.designpattern.duckbehaviors;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.print("오리 날다~\n");
    }
}
