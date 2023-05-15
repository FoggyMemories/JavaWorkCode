package com.qian.school_2023.Mar.exercise03_01.demo2;

public class TestMain2 {
    public static void main(String[] args) {
        Flower f1 = new Flower();
        f1.setColor("red");
        System.out.println(f1.getColor());
        Flower f2 = new Flower("yellow");
        System.out.println(f2.getColor());
    }
}
