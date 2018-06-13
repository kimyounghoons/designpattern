package com.example.kimyounghoon.designpattern.characterbehaviors;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.print("화살 발사!\n");
    }
}
