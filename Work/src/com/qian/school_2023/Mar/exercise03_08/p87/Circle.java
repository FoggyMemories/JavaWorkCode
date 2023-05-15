package com.qian.school_2023.Mar.exercise03_08.p87;

class Circle {
    final static double PI = 3.14159;
    double radius;
    static int numOfObjects = 0;

    Circle() {
        radius = 1.0;
        numOfObjects++;
    }

    Circle(double radius) {
        this.radius = radius;
        numOfObjects++;
    }

    static int getNumOfObjects() {
        return numOfObjects;
    }

    double getArea() {
        return Math.pow(radius, 2) * PI;
    }
}
