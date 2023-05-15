package com.qian.school_2023.Aprl.exercise04_26.work.p133_9_6;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.1, "red");
        Circle c2 = new Circle(1.3, "red");
        System.out.println(c1.radius);
        System.out.println(c1.color);
        System.out.println(c1.equals(c2));
    }
}
