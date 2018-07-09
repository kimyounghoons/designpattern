package com.example.kimyounghoon.designpattern;

public class ConcreteMediator implements IMediator {

    ColleagueA talk;
    ColleagueB fight;

    @Override
    public void fight() {
        System.out.println("Mediator is fighting");
    }

    @Override
    public void talk() {
        System.out.println("Mediator is talking");
    }

    @Override
    public void registerA(ColleagueA a) {
        talk = a;
    }

    @Override
    public void registerB(ColleagueB b) {
        fight = b;
    }
}
