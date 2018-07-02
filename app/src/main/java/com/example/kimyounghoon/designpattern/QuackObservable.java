package com.example.kimyounghoon.designpattern;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObserver();
}
