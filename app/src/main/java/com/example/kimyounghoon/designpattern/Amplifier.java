package com.example.kimyounghoon.designpattern;

class Amplifier {
    private DvdPlayer dvd;
    private int volume;

    public void on() {
        System.out.println("Amplifier on");
    }

    public void setDvd(DvdPlayer dvd) {
        this.dvd = dvd;
        System.out.println("Amplifier set dvd ="+dvd);
    }

    public void setSurroundSound() {
        System.out.println("Amplifier set surround");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Amplifier set volume"+volume);
    }

    public void off() {
        System.out.println("Amplifier off");
    }
}
