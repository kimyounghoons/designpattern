package com.example.kimyounghoon.designpattern.ducks;

public class DecoyDuck extends Duck {
    @Override
    void display() {
        System.out.print("가짜 오리 모양 표시\n");
    }
}
