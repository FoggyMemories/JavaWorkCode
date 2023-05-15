package com.qian.school_2023.Aprl.exercise04_26.work.p133_9_6;

public abstract class Shape {
    protected String color;

    public Shape() {
        this.color = "white";
    }

    public Shape(String color) {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
