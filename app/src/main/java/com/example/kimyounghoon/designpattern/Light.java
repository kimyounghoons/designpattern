package com.example.kimyounghoon.designpattern;

class Light extends AbstractModel implements OnoffListener {


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
