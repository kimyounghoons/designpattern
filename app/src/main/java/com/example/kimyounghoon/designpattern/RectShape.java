package com.example.kimyounghoon.designpattern;

public class RectShape extends BaseShape {
    private double x, y, width, height;

    public RectShape(double x, double y, double width, double height, BaseDrawing baseDrawing) {
        super(baseDrawing);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }


    @Override
    public void draw() {
        baseDrawing.drawRect(x,y,width,height);
    }

    @Override
    public void resizeByPercentage(double pct) {

    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }
}
