package com.example.kimyounghoon.designpattern;

public interface StereoListener extends OnoffListener {
    void setCd();

    void setDvd();

    void setRadio();

    void setVolume(int volume);
}
