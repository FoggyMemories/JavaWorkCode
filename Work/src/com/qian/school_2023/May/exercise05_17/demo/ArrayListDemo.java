package com.qian.school_2023.May.exercise05_17.demo;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            al.add(new Circle(i));
        }

        for (int i = 0; i < al.size(); i++) {
            System.out.println("第" + (i + 1) + "个圆的面积是:" + al.get(i));
        }

        System.out.println("----------------------");

        System.out.println(al);
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
        return "圆面积:" + getArea();
    }

    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
