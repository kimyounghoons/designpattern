package com.example.kimyounghoon.designpattern;

public interface GarageDoorListener extends OnoffListener {
    void up();

    void down();

    void stop();
}
