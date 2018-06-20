package com.example.kimyounghoon.designpattern;

class TheaterLights {
    public void dim(int i) {
        System.out.println(String.format("Theater ceiling Lights dimming to %1$d",i));
    }

    public void on() {
        System.out.println("Theater ceiling Lights on");
    }
}
