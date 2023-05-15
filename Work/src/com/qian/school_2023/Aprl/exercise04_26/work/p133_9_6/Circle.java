package com.qian.school_2023.Aprl.exercise04_26.work.p133_9_6;

public class Circle extends Shape{
    protected double radius;

    public Circle() {
        this(1.0,"white");
    }

    public Circle(double radius) {
        super("white");
        this.radius = radius;
    }
    public Circle(double radius,String color){
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }

    public boolean equals(Circle circle){
        return this.radius == circle.getRadius();
    }
    public String toString() {
        return "[Circle] radius = " + radius;
    }
}
