package com.qian.school_2023.May.exercise05_17.demo;

public class ArrayListDemo {
    public static void main(String[] args) {

    }
}

class Circle {
    double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * 获取
     *
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * 设置
     *
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle{radius = " + radius + "}";
    }

    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
