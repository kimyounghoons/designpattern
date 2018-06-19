package com.example.kimyounghoon.designpattern.models;

import com.example.kimyounghoon.designpattern.interfaces.OnoffListener;

public class UpgradeCeilingFan extends AbstractModel implements OnoffListener
{
    public static final  int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    int speed;

    public UpgradeCeilingFan(String location){
        super(location);
        speed = OFF;
    }

    public void high(){
        speed = HIGH;
        System.out.println("speed : "+ speed);
    }


    public void medium(){
        speed = MEDIUM;
        System.out.println("speed : "+ speed);
    }


    public void low(){
        speed = LOW;
        System.out.println("speed : "+ speed);
    }


    @Override
    public void on() {
        println("on high");
    }

    @Override
    public void off(){
        speed = OFF;
        System.out.println("speed : "+ speed);
    }

    public int getSpeed(){
        return speed;
    }
}