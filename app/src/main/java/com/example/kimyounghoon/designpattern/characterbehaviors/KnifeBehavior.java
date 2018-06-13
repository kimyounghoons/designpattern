package com.example.kimyounghoon.designpattern.characterbehaviors;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.print("칼로 벰\n");
    }
}
