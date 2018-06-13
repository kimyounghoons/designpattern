package com.example.kimyounghoon.designpattern.displays;

import com.example.kimyounghoon.designpattern.interfaces.DisplayElement;
import com.example.kimyounghoon.designpattern.interfaces.Observer;
import com.example.kimyounghoon.designpattern.interfaces.Subject;

public class ThirdPartyDisplay implements Observer, DisplayElement {
    Subject weatherData;
    private float temperature;

    public ThirdPartyDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        display();
    }

    @Override
    public void display() {
        System.out.println("ThirdPartyDisplay - temperature : " + temperature);
    }

    public void registerObserver(){
        weatherData.registerObserver(this);
    }

    public void removeObserver(){
        weatherData.removeObserver(this);
    }
}
