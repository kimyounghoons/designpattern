package com.example.kimyounghoon.designpattern;

import com.example.kimyounghoon.designpattern.beverages.Beverage;
import com.example.kimyounghoon.designpattern.beverages.HouseBlend;
import com.example.kimyounghoon.designpattern.beverages.Mocha;
import com.example.kimyounghoon.designpattern.beverages.Soy;
import com.example.kimyounghoon.designpattern.beverages.Whip;

import org.junit.Test;

public class DecoraterUnitTest {

    @Test
    public void costTestAndDescription() {
        Beverage beverage = new HouseBlend();
        Soy soy = new Soy(beverage);
        Whip whip = new Whip(soy);
        Mocha mocha = new Mocha(whip);

        System.out.println("cost : " + soy.cost());
        System.out.println("description :" + soy.getDescription());
        System.out.println();

        System.out.println("cost : " + whip.cost());
        System.out.println("description :" + whip.getDescription());
        System.out.println();

        System.out.println("cost : " + mocha.cost());
        System.out.println("description :" + mocha.getDescription());
        System.out.println();
    }

}