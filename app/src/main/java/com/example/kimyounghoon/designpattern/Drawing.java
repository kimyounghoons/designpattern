package com.example.kimyounghoon.designpattern;

public class Drawing implements BaseDrawing {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("drawCircle %f, %f radius %f\n", x,y,radius);
    }

    @Override
    public void drawRect(double x, double y, double width, double height) {
        System.out.printf("drawRect %f, %f width %f height %f\n",x,y,width,height);
    }
}
