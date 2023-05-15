package com.qian.school_2023.Mar.exercise03_15.work.p100;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this(10.0); //这条语句先当于调用方法Circle(10.0),但是,this(10.0)不等于Circle(10.0)
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
