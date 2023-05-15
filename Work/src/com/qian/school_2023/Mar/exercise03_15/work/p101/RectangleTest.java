package com.qian.school_2023.Mar.exercise03_15.work.p101;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1.1f, 1.2f, "red");
        Rectangle r2 = new Rectangle();
        r2.setWidth(1.2f);
        r2.setHeight(1.3f);
        r2.setColor("black");
        System.out.println(r1.getArea(r1.getWidth(), r1.getHeight()));
        System.out.println(r2.getArea(r2.getWidth(), r2.getHeight()));
    }
}
