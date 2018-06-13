package com.example.kimyounghoon.designpattern.characterbehaviors;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.print("검을 휘두름\n");
    }
}
