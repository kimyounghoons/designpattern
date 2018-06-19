package com.example.kimyounghoon.designpattern.models;

import com.example.kimyounghoon.designpattern.interfaces.OnoffListener;

public class CeilingFan extends AbstractModel implements OnoffListener {

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
