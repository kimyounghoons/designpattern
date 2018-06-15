package com.example.kimyounghoon.designpattern.factories;

import com.example.kimyounghoon.designpattern.material.Cheese;
import com.example.kimyounghoon.designpattern.material.Clams;
import com.example.kimyounghoon.designpattern.material.Dough;
import com.example.kimyounghoon.designpattern.material.Pepperoni;
import com.example.kimyounghoon.designpattern.material.Sauce;
import com.example.kimyounghoon.designpattern.material.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();
}
