package com.example.kimyounghoon.designpattern.pizza;

import com.example.kimyounghoon.designpattern.material.Cheese;
import com.example.kimyounghoon.designpattern.material.Clams;
import com.example.kimyounghoon.designpattern.material.Dough;
import com.example.kimyounghoon.designpattern.material.Pepperoni;
import com.example.kimyounghoon.designpattern.material.Sauce;
import com.example.kimyounghoon.designpattern.material.Veggies;

import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;
    protected ArrayList toppings = new ArrayList();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings : ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
