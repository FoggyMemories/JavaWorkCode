package com.qian.school_2022.Dece.exercise12_05.demo;

public class methodReturn2 {
    public static void main(String[] args) {
        info(20, "钱睿");
        System.out.println();
        info("钱睿", 20);
    }

    public static void info(int age, String name) {
        System.out.printf("name = %s,age = %d!", name, age);
    }

    public static void info(String name, int age) {
        System.out.printf("name = %s,age = %d!", name, age);
    }
}
