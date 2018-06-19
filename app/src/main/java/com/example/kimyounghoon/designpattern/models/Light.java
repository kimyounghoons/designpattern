package com.example.kimyounghoon.designpattern.models;

import com.example.kimyounghoon.designpattern.interfaces.OnoffListener;

public class Light extends AbstractModel implements OnoffListener {


    public Light(String title) {
        super(title);
    }

    @Override
    public void on() {
      println("light on");
    }

    @Override
    public void off() { println("light off");
    }

}
