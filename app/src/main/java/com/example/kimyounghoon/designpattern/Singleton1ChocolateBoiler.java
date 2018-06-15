package com.example.kimyounghoon.designpattern;

public class Singleton1ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static Singleton1ChocolateBoiler instance;

    public static Singleton1ChocolateBoiler getInstance() {
        if (instance == null) {
            instance = new Singleton1ChocolateBoiler();
        }
        return instance;
    }

    private Singleton1ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
