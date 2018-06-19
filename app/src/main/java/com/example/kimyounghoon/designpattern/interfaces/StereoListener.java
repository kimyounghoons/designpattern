package com.example.kimyounghoon.designpattern.interfaces;

import com.example.kimyounghoon.designpattern.interfaces.OnoffListener;

public interface StereoListener extends OnoffListener {
    void setCd();

    void setDvd();

    void setRadio();

    void setVolume(int volume);
}