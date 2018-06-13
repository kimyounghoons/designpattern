package com.example.kimyounghoon.designpattern.ducks;

import com.example.kimyounghoon.designpattern.duckbehaviors.FlyBehavior;
import com.example.kimyounghoon.designpattern.duckbehaviors.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    abstract void display();

    public void swim(){
        System.out.print("수영 ㄱㄱ");
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}
