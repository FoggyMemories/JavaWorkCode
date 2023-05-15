package com.qian.school_2023.Aprl.exercise04_26.demo;

/*
1.一个类实现多个接口,各接口之间用逗号隔开
 */

public class Test2 {
    public static void main(String[] args) {
        ShiXianClass s1 = new ShiXianClass();
        if(!s1.isInterface1()){
            System.out.println("实现类1");
        }
        System.out.println(s1.isInterface2());
    }
}
