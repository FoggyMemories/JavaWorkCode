package com.qian.school_2022.Novm.exercise11_07.work;

public class p42_3_6_13 {
    public static void main(String[] args) {
        int y = 8;
        boolean i = (y > 1) && (y++ > 1);
        System.out.println(i);
        System.out.println(y);
    }
}
