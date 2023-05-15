package com.qian.school_2022.Novm.exercise11_02.test;

import java.util.Scanner;

public class classTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        switch (score / 10) {
            case 10,9 -> System.out.println("优秀");
            case 8,7,6 -> System.out.println("及格了");
            case 5,4,3,2,1,0 -> System.out.println("没及格");
            default -> System.out.println("继续努力吧！");
        }
    }
}
