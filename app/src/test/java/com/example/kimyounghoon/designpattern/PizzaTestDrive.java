package com.example.kimyounghoon.designpattern;

import com.example.kimyounghoon.designpattern.pizza.Pizza;
import com.example.kimyounghoon.designpattern.stores.ChicagoStore;
import com.example.kimyounghoon.designpattern.stores.NYPizzaStore;
import com.example.kimyounghoon.designpattern.stores.PizzaStore;

import org.junit.Test;

public class PizzaTestDrive {

    @Test
    public void pizzaTest(){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "+ pizza.getName()+"\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a "+ pizza.getName()+"\n");
    }
}
