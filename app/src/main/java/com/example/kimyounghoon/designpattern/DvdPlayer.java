package com.example.kimyounghoon.designpattern;

class DvdPlayer {
    public void on() {
        System.out.println("Dvd on");
    }

    public void play(String movie) {
        System.out.println("Dvd play" + movie);
    }

    public void stop() {
        System.out.println("dvd player stop");
    }

    public void eject() {
        System.out.println("dvd player eject");
    }

    public void off() {
        System.out.println("dvd player off");
    }
}
