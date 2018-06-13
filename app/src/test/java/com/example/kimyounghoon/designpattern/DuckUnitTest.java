package com.example.kimyounghoon.designpattern;

import com.example.kimyounghoon.designpattern.duckbehaviors.FlyNoWay;
import com.example.kimyounghoon.designpattern.duckbehaviors.FlyWithWings;
import com.example.kimyounghoon.designpattern.duckbehaviors.MuteQuack;
import com.example.kimyounghoon.designpattern.duckbehaviors.Squack;
import com.example.kimyounghoon.designpattern.ducks.Duck;
import com.example.kimyounghoon.designpattern.ducks.MallardDuck;

import org.junit.Test;

public class DuckUnitTest {

    @Test
    public void DuckTest(){
        Duck duck = new MallardDuck();
        duck.setFlyBehavior(new FlyNoWay());
        duck.setQuackBehavior(new MuteQuack());
        duck.performFly();
        duck.performQuack();

        duck.setFlyBehavior(new FlyWithWings());
        duck.setQuackBehavior(new Squack());
        duck.performFly();
        duck.performQuack();
    }
}
