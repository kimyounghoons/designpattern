package com.example.kimyounghoon.designpattern;

public class CircleShape extends BaseShape {
    private double x, y, radius;

    public CircleShape(double x, double y, double radius, BaseDrawing baseDrawing) {
        super(baseDrawing);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        baseDrawing.drawCircle(x, y, radius);
    }

    @Override
    public void resizeByPercentage(double pct) {
        radius = radius * pct;
    }

    @Override
    public void setWidth(double width) {

    }

    @Override
    public void setHeight(double height) {

    }
}
