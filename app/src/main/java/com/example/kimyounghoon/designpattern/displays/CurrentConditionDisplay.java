package com.example.kimyounghoon.designpattern.displays;

import com.example.kimyounghoon.designpattern.interfaces.DisplayElement;
import com.example.kimyounghoon.designpattern.interfaces.Observer;
import com.example.kimyounghoon.designpattern.interfaces.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionDisplay - temperature : " + temperature + ", humidity : " + humidity);
    }

    public void registerObserver(){
        weatherData.registerObserver(this);
    }

    public void removeObserver(){
        weatherData.removeObserver(this);
    }
}
