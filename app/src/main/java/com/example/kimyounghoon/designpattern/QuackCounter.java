package com.example.kimyounghoon.designpattern;

public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberofQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberofQuacks++;
    }

    public static int getQuacks(){
        return numberofQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObserver() {
        duck.notifyObserver();
    }
}
