package com.example.kimyounghoon.designpattern;

public class Singleton3ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private volatile static Singleton3ChocolateBoiler instance;

    public static Singleton3ChocolateBoiler getInstance() {
        if (instance == null) {
            synchronized (Singleton3ChocolateBoiler.class) {
                if (instance == null) {
                    instance = new Singleton3ChocolateBoiler();
                }
            }
        }
        return instance;
    }

    private Singleton3ChocolateBoiler() {
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
