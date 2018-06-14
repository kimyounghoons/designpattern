package com.example.kimyounghoon.designpattern.stores;

import com.example.kimyounghoon.designpattern.factories.ChicagoIngredientFactory;
import com.example.kimyounghoon.designpattern.interfaces.PizzaIngredientFactory;
import com.example.kimyounghoon.designpattern.pizza.CheesePizza;
import com.example.kimyounghoon.designpattern.pizza.ClamPizza;
import com.example.kimyounghoon.designpattern.pizza.PepperoniPizza;
import com.example.kimyounghoon.designpattern.pizza.Pizza;
import com.example.kimyounghoon.designpattern.pizza.VeggiePizza;

public class ChicagoStore extends PizzaStore {

    public ChicagoStore() {
    }

    @Override
    Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style pepperoni Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style clam Pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style veggie Pizza");
        }
        return pizza;
    }
}
