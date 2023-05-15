package com.qian.school_2022.Dece.exercise12_05.demo;

public class test {
    public static void main(String[] args) {
        System.out.println(max(3, 4));
        System.out.println(max(3.0, 5.4));
        System.out.println(max(3.0, 5.4, 10.14));
    }

    public static int max(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static double max(double num1, double num2) {
        return Math.max(num1, num2);
    }

    public static double max(double num1, double num2, double num3) {
        return Math.max(max(num1, num2), num3);
    }

}
