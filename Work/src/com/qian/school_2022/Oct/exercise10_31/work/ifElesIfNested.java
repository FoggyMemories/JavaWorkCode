package com.qian.school_2022.Oct.exercise10_31.work;

import java.util.Scanner;

public class ifElesIfNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您的成绩");
            int score = sc.nextInt();
            if (score >= 60 && score <= 100) {
                System.out.println("您的成绩及格");
                if (score >= 90) {
                    System.out.println("您的成绩优秀");
                    break;
                } else if (score >= 80) {
                    System.out.println("您的成绩优良");
                    break;
                } else if (score >= 70) {
                    System.out.println("您的成绩中等");
                    break;
                } else {
                    System.out.println("您的成绩刚好及格");
                    break;
                }
            } else if (score < 60 && score >= 0) {
                System.out.println("您的成绩未及格");
                break;
            } else {
                System.out.println("您所输入的成绩有误,请重新输入");
            }
        }
    }
}


