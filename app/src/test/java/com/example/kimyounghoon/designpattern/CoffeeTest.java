package com.example.kimyounghoon.designpattern;

import com.example.kimyounghoon.designpattern.beverage.Coffee;

import org.junit.Test;

public class CoffeeTest {

    @Test
    public void test(){
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
