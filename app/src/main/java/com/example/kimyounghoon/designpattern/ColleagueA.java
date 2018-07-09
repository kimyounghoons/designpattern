package com.example.kimyounghoon.designpattern;

public class ColleagueA extends Colleague {
    public ColleagueA(IMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void doSomething() {
        mediator.talk();
        mediator.registerA(this);
    }
}
