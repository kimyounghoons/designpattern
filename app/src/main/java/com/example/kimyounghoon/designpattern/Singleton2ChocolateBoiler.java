package com.example.kimyounghoon.designpattern;

public class Singleton2ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static Singleton2ChocolateBoiler instance = new Singleton2ChocolateBoiler();

    public static Singleton2ChocolateBoiler getInstance() {
        return instance;
    }

    private Singleton2ChocolateBoiler() {
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
