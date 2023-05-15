package com.qian.school_2023.Mar.exercise03_01.demo4;

public class Circle {
    double radius;

    public Circle() {
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

    double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}
