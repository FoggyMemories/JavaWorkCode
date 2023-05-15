package com.qian.school_2022.Oct.exercise10_26.work;

public class day4_2022_10_26_2_3 {
    public static void main(String[] args) {
        int a = 5, b = 7, c = 3, d = 6;
        boolean x;
        System.out.println("短路与");
        x = a > b && c < d;
        System.out.println(x);
        System.out.println("短路或");
        x = b > a || d < c;
        System.out.println(x);
        System.out.println("与");
        x = b > a & c > d;
        System.out.println(x);
        System.out.println("或");
        x = b > a | c < d;
        System.out.println(x);
        System.out.println("逻辑非");
        x = !(b > a);
        System.out.println(x);
    }
}
