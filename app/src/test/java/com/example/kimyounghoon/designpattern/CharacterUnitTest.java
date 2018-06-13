package com.example.kimyounghoon.designpattern;

import com.example.kimyounghoon.designpattern.characterbehaviors.AxeBehavior;
import com.example.kimyounghoon.designpattern.characterbehaviors.KnifeBehavior;
import com.example.kimyounghoon.designpattern.characters.Character;
import com.example.kimyounghoon.designpattern.characters.King;

import org.junit.Test;

public class CharacterUnitTest {

    @Test
    public void characterTest(){
        Character character = new King();
        character.setWeapon(new AxeBehavior());
        character.fight();

        character.setWeapon(new KnifeBehavior());
        character.fight();
    }
}
