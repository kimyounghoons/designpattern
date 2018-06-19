package com.example.kimyounghoon.designpattern.adapters;

import com.example.kimyounghoon.designpattern.interfaces.Turkey;
import com.example.kimyounghoon.designpattern.interfaces.Duck;

public class TurckeyAdapter implements Duck {
    Turkey turkey;

    public TurckeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
