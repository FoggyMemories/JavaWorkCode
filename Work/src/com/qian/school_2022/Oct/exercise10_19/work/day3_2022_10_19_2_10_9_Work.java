package com.qian.school_2022.Oct.exercise10_19.work;

import java.util.Scanner;

public class day3_2022_10_19_2_10_9_Work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入这5个变量的值分编为:");
        int r = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(4 / (3 * (r + 34)) - 9 * (a + b * c) + (3 + d * (2 + a)) / (a + b * d));
    }
}
