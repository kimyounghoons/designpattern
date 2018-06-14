package com.example.kimyounghoon.designpattern.factories;

import com.example.kimyounghoon.designpattern.interfaces.PizzaIngredientFactory;
import com.example.kimyounghoon.designpattern.material.Cheese;
import com.example.kimyounghoon.designpattern.material.Clams;
import com.example.kimyounghoon.designpattern.material.Dough;
import com.example.kimyounghoon.designpattern.material.Onion;
import com.example.kimyounghoon.designpattern.material.Pepperoni;
import com.example.kimyounghoon.designpattern.material.Sauce;
import com.example.kimyounghoon.designpattern.material.Veggies;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new Dough();
    }

    @Override
    public Sauce createSauce() {
        return new Sauce();
    }

    @Override
    public Cheese createCheese() {
        return new Cheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{
                new Onion()
        };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni();
    }

    @Override
    public Clams createClam() {
        return new Clams();
    }
}