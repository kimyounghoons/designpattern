package com.example.kimyounghoon.designpattern;

class CeilingFan extends AbstractModel implements OnoffListener
{

    public CeilingFan(String title) {
        super(title);
    }

    @Override
    public void on() {
        println("on high");
    }

    @Override
    public void off() {
        println("off");
    }
}
