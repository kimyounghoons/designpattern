package com.example.kimyounghoon.designpattern;

public abstract class BaseShape {
    protected BaseDrawing baseDrawing;

    public BaseShape(BaseDrawing baseDrawing) {
        this.baseDrawing = baseDrawing;
    }

    public abstract void draw();
    public abstract void resizeByPercentage(double pct);
    public abstract void setWidth(double width);
    public abstract void setHeight(double height);

}
