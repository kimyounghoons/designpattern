package com.example.kimyounghoon.designpattern.stores;

import com.example.kimyounghoon.designpattern.pizza.Pizza;

public abstract class PizzaStore {
    Pizza pizza;

    public PizzaStore() {
    }

    public Pizza orderPizza(String type) {
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
