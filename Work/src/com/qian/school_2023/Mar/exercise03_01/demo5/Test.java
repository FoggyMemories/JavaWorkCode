package com.qian.school_2023.Mar.exercise03_01.demo5;

public class    Test {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setAge(30);
        t.setName("钱睿");

        System.out.println(t.getName() + "今年" + t.getAge() + "岁了");
    }
}
