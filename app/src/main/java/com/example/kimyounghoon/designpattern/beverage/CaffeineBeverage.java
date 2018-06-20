package com.example.kimyounghoon.designpattern.beverage;

public abstract class CaffeineBeverage {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments())
        addCondiments();
    }

    public boolean customerWantsCondiments() { //후크 메소드 override 해서 사용
        return true;
    }

    void boilWater(){
        System.out.println("물 끓이는 중");
    }

    void pourInCup(){
        System.out.println("컵에 따르는 중");
    }

    abstract void  brew();

    abstract void addCondiments();
}
