package com.example.kimyounghoon.designpattern.stores;

import com.example.kimyounghoon.designpattern.factories.NYPizzaIngredientFactory;
import com.example.kimyounghoon.designpattern.factories.PizzaIngredientFactory;
import com.example.kimyounghoon.designpattern.pizza.CheesePizza;
import com.example.kimyounghoon.designpattern.pizza.ClamPizza;
import com.example.kimyounghoon.designpattern.pizza.PepperoniPizza;
import com.example.kimyounghoon.designpattern.pizza.Pizza;
import com.example.kimyounghoon.designpattern.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

    public NYPizzaStore() {
    }

    @Override
    Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style pepperoni Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style clam Pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style veggie Pizza");
        }
        return pizza;
    }
}
