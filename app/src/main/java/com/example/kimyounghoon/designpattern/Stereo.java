package com.example.kimyounghoon.designpattern;

public class Stereo extends AbstractModel implements StereoListener {

    public Stereo(String title) {
        super(title);
    }

    @Override
    public void setCd() {
        println("stereo is set for CD input");
    }

    @Override
    public void setDvd() {
        println("stereo is set for DVD input");
    }

    @Override
    public void setRadio() {
        println("stereo is set for Radio input");
    }

    @Override
    public void setVolume(int volume) {
        println("stereo volume set to " + volume);
    }

    @Override
    public void on() {
        println("stereo is on");
    }

    @Override
    public void off() {
        println("stereo is off");
    }

}
