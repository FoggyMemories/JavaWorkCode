package com.qian.school_2023.Aprl.exercise04_19.demo;

public class Test3 {
    public static void main(String[] args) {
        String s1 = "213";
        String s2 = "456";
        if(s1.equals(s2)) System.out.println("相等");
        else System.out.println("不相等");
        System.out.println(new A().toString());
    }
}
class A extends Object{
    @Override
    public String toString() {
        return "我是A";
    }
}
