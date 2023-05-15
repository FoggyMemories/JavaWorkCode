package com.qian.school_2022.Novm.exercise11_23.test;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要判断的年份：");
        int year = sc.nextInt();
        isOrNotLeapYear(year);
    }

    public static void isOrNotLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }
}
