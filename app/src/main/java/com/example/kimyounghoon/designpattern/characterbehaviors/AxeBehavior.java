package com.example.kimyounghoon.designpattern.characterbehaviors;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.print("도끼로 찍음\n");
    }
}
