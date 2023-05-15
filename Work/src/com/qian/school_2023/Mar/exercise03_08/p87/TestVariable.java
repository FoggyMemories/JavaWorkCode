package com.qian.school_2023.Mar.exercise03_08.p87;

public class TestVariable {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(20);
        c1.radius = 10;
        System.out.println("c1的");
        printCircle(c1);
        System.out.println("c2的");
        printCircle(c2);
    }

    static void printCircle(Circle c) {
        System.out.println("半径" + c.radius + ", 当前对象数:" + c.getNumOfObjects());
    }
}
