package com.qian.school_2023.Mar.exercise03_01.demo4;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("圆c1的半径" + c1.radius + "、面积:" + c1.getArea());
        Circle c2 = new Circle(10);
        System.out.println("圆c2的半径" + c2.radius + "、面积:" + c2.getArea());
        Circle c3 = new Circle(15);
        System.out.println("圆c3的半径" + c3.radius + "、面积:" + c3.getArea());
        c3.radius = 20;
        System.out.println("圆c3的半径修改为" + c3.radius + "、面积:" + c3.getArea());

    }
}
