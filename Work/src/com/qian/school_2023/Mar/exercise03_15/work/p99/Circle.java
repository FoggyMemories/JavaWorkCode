package com.qian.school_2023.Mar.exercise03_15.work.p99;

class Circle {
    final static double PI = 3.14159;
    private double radius;
    private static int numOfObjects = 0;

    public Circle() {
        radius = 1.0;
        numOfObjects++;
    }

    public Circle(double r) {
        radius = r;
        numOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public static int getNumOfObjects() {
        return numOfObjects;
    }

    public double getArea() {
        return radius * radius * PI;
    }
}
