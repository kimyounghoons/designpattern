package com.example.kimyounghoon.designpattern;

import com.example.kimyounghoon.designpattern.adapters.TurckeyAdapter;
import com.example.kimyounghoon.designpattern.interfaces.Duck;
import com.example.kimyounghoon.designpattern.ducks.MallardDuck;
import com.example.kimyounghoon.designpattern.ducks.WildTurkey;

import org.junit.Test;

public class DuckTest {

    @Test
    public void test(){
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();

        Duck turckeyAdapter = new TurckeyAdapter(turkey);

        System.out.println("The Turckey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);


        System.out.println("\nThe TurckeyAdapter says...");
        testDuck(turckeyAdapter);
    }

    private void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }


}
