package com.example.kimyounghoon.designpattern.models;

import com.example.kimyounghoon.designpattern.interfaces.GarageDoorListener;

public class GarageDoor extends AbstractModel implements GarageDoorListener {

    public GarageDoor(String title) {
        super(title);
    }

    @Override
    public void on() {
        println("light on");
    }

    @Override
    public void off() {
        println("light off");
    }

    @Override
    public void up() {
        println("door up");
    }

    @Override
    public void down() {
        println("door down");
    }

    @Override
    public void stop() {
        println("door stop");
    }
}
