package com.example.kimyounghoon.designpattern.characters;

import com.example.kimyounghoon.designpattern.characterbehaviors.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public void fight() {
        weaponBehavior.useWeapon();
    }

    public void setWeapon(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

}