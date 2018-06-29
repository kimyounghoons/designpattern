package com.example.kimyounghoon.designpattern;

import org.junit.Test;

public class DuckTest {

    @Test
    public void simulate(){
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulate(duckFactory);
//        Quackable mallardDuck = new QuackCounter(new MallardDuck());
//        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
//        Quackable duckCall = new QuackCounter(new DuckCall());
//        Quackable rubberDuck = new QuackCounter(new RubberDuck());
//        Quackable gooseDuck = new QuackCounter(new GooseAdapter(new Goose()));
//        System.out.println("\nDuck Simulator");

//        simulate(mallardDuck);
//        simulate(redheadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
//        simulate(gooseDuck);
//
//        System.out.println("The ducks quacked "+ QuackCounter.getQuacks()+" times.");
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator : With Abstract Factory");

        Flock flockOfMallards = new Flock();
        flockOfMallards.add(mallardDuck);
        flockOfMallards.add(redheadDuck);
        flockOfMallards.add(duckCall);
        flockOfMallards.add(rubberDuck);
        flockOfMallards.add(gooseDuck);

        simulate(flockOfMallards);

//        simulate(mallardDuck);
//        simulate(redheadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
//        simulate(gooseDuck);

        System.out.println("The ducks quacked "+ QuackCounter.getQuacks()+" times.");

    }

    private void simulate(Quackable duck){
        duck.quack();
    }
}
