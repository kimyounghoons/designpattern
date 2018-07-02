package com.example.kimyounghoon.designpattern;

import org.junit.Test;

public class DuckObserverTest {

    @Test
    public void test() {
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        Flock flockDucks = new Flock();
        flockDucks.add(duckCall);
        flockDucks.add(mallardDuck);
        flockDucks.add(redheadDuck);
        flockDucks.add(rubberDuck);

        System.out.println();
        Quacklogist quacklogist = new Quacklogist();
        flockDucks.registerObserver(quacklogist);
        simulate(flockDucks);

    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
