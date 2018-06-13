package com.example.kimyounghoon.designpattern;

import com.example.kimyounghoon.designpattern.data.WeatherData;
import com.example.kimyounghoon.designpattern.displays.CurrentConditionDisplay;
import com.example.kimyounghoon.designpattern.displays.StatisticsDisplay;
import com.example.kimyounghoon.designpattern.displays.ThirdPartyDisplay;

import org.junit.Test;

public class ObserverUnitTest {

    @Test
    public void observerTest(){
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ThirdPartyDisplay thirdPartyDisplay = new ThirdPartyDisplay(weatherData);

        weatherData.setMeasurements(123,333,11);
        weatherData.setMeasurements(125,335,15);

        statisticsDisplay.removeObserver();
        currentConditionDisplay.removeObserver();
        weatherData.setMeasurements(1,2,3);


        statisticsDisplay.registerObserver();
        currentConditionDisplay.registerObserver();

        weatherData.setMeasurements(4,5,6);
    }
}
