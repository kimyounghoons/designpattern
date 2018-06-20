package com.example.kimyounghoon.designpattern;

import org.junit.Test;

public class FacadeTest {

    @Test
    public void test() {
        HomeTheterFacade homeTheterFacade = new HomeTheterFacade(
                new Amplifier(),
                new Tuner(),
                new DvdPlayer(),
                new CdPlayer(),
                new Projector(),
                new TheaterLights(),
                new Screen(),
                new PopcornPopper());
        homeTheterFacade.watchMovie("aaa");
        homeTheterFacade.endMovie();
    }
}
