package com.example.kimyounghoon.designpattern;

import org.junit.Test;

public class ShapeTest {
    @Test
    public void test(){
        BaseShape baseCircleShape = new CircleShape(1,2,30,new Drawing());
        baseCircleShape.draw();

        BaseShape baseRectShape = new RectShape(1,2,30,40,new Drawing());
        baseRectShape.draw();
    }
}
