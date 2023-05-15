package com.qian.school_2022.Oct.exercise10_31.work;

import java.util.Scanner;

public class ifElesIfTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您的成绩");
            int score = sc.nextInt();
            if (score >= 90 && score <= 100) {
                System.out.println("您的成绩优秀");
                break;
            } else if (score >= 80) {
                System.out.println("您的成绩优良");
                break;
            } else if (score >= 70) {
                System.out.println("您的成绩中等");
                break;
            } else if (score >= 60) {
                System.out.println("您的成绩刚好及格");
                break;
            } else if (score >= 0) {
                System.out.println("您的成绩不合格");
                break;
            } else {
                System.out.println("您所输入的成绩有误,请重新输入");
            }
        }
    }
}
