package com.example.kimyounghoon.designpattern.interfaces;

public interface GarageDoorListener extends OnoffListener {
    void up();

    void down();

    void stop();
}
