package com.qian.school_2022.Oct.exercise10_12.test;

public class day2_2022_10_12_2 {
    public static void main(String[] args) {
        String _nameString = "花花";
        int $age = 10;
        String hobby = "学习";
        System.out.println(_nameString + "今年" + $age + "岁了!     " + "爱好是" + hobby + "!");

        byte a = -128;
        System.out.println("\na=" + a);
        byte a1 = 127;
        System.out.println("a2=" + a1);

        short a2 = -129;//short是2byte = 16bit
        System.out.println(a2);

        int b1 = 32769;  //int 是 4byte = 32bit
        System.out.println(b1);

        long c1 = 1000000;//long是 8byte = 64bit
        System.out.println(c1);

        System.out.println("这些数分别为:" + a + " " + a1 + " " + a2 + " " + b1 + " " + c1);

    }
}
