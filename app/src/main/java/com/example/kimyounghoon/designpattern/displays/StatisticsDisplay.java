package com.example.kimyounghoon.designpattern.displays;

import com.example.kimyounghoon.designpattern.interfaces.DisplayElement;
import com.example.kimyounghoon.designpattern.interfaces.Observer;
import com.example.kimyounghoon.designpattern.interfaces.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {
    Subject weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("StatisticsDisplay - temperature : " + temperature + ", humidity : " + humidity + ", pressure : " + pressure);
    }

    public void registerObserver(){
        weatherData.registerObserver(this);
    }

    public void removeObserver(){
        weatherData.removeObserver(this);
    }
}
