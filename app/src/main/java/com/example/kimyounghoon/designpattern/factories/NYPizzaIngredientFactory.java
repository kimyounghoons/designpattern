package com.example.kimyounghoon.designpattern.factories;

import com.example.kimyounghoon.designpattern.material.Cheese;
import com.example.kimyounghoon.designpattern.material.Clams;
import com.example.kimyounghoon.designpattern.material.Dough;
import com.example.kimyounghoon.designpattern.material.Garlic;
import com.example.kimyounghoon.designpattern.material.Mushroom;
import com.example.kimyounghoon.designpattern.material.Onion;
import com.example.kimyounghoon.designpattern.material.Pepperoni;
import com.example.kimyounghoon.designpattern.material.RedPepper;
import com.example.kimyounghoon.designpattern.material.Sauce;
import com.example.kimyounghoon.designpattern.material.Veggies;
import com.example.kimyounghoon.designpattern.material.newyork.FreshClams;
import com.example.kimyounghoon.designpattern.material.newyork.MarinaraSauce;
import com.example.kimyounghoon.designpattern.material.newyork.ReggianoCheese;
import com.example.kimyounghoon.designpattern.material.newyork.SlicedPepperoni;
import com.example.kimyounghoon.designpattern.material.newyork.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
