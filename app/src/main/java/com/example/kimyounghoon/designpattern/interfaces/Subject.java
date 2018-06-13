package com.example.kimyounghoon.designpattern.interfaces;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
