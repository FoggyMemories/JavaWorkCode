package com.qian.school_2022.Novm.exercise11_07.work;

import java.util.Scanner;

public class p41_3_6_9_2 {
    public static void main(String[] args) {
        //switch
        System.out.println("请输入一个星期整数：");
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        switch (week) {
            case 1, 2, 3, 4, 5 -> System.out.println("工作日");
            case 6, 7 -> System.out.println("休息日");
            default -> System.out.println("输入的星期数有误。");
        }

        //优点：运算速度较快
        //缺点：一次只能执行一个判断符号
    }
}
