package com.example.kimyounghoon.designpattern.beverage;

import com.example.kimyounghoon.designpattern.beverage.CaffeineBeverage;

public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("필터로 커피 우려내는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("설탕과 우유를 추가 하는 중");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = "no";
        return answer.toLowerCase().startsWith("y");
    }

}