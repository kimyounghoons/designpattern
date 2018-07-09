package com.example.kimyounghoon.designpattern;

public class ColleagueB extends Colleague {

    public ColleagueB(IMediator mediator) {
        this.mediator = mediator;
        this.mediator.registerB(this);
    }

    @Override
    public void doSomething() {
        mediator.fight();
    }
}
