package com.qian.school_2022.Oct.exercise10_12.work;

import java.util.Scanner;

public class day2_2022_10_12_4_Work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数位于10 ~ 1000之间：");
        int x = sc.nextInt();

        int ge;
        int shi;
        int bai;
        int qian;
        int sum;

        if (x >= 10 && x < 100) {
            ge = x % 10;
            shi = x / 10 % 10;
            sum = ge + shi;
            System.out.println("各位数字之和为：" + sum);
        } else if (x >= 100 && x < 1000) {
            ge = x % 10;
            shi = x / 10 % 10;
            bai = x / 100 % 10;
            sum = ge + shi + bai;
            System.out.println("各位数字之和为：" + sum);
        } else if (x == 1000) {
            qian = x / 1000 % 10;
            sum = qian;
            System.out.println("各位数字之和为：" + sum);

        } else {
            System.out.println("您所输入的数字有误。");
        }
    }
}
