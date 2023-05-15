package com.qian.school_2022.Novm.exercise11_07.test;

import java.util.Scanner;

public class p41_3_6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int PositiveNumber = 0;
        int NegativeNumber = 0;
        int count = 1;
        System.out.println("当输入的数字为0时停止输入.");
        while (true) {
            System.out.println("请从键盘输入第" + count + "个整形数");
            int num = sc.nextInt();
            if (num == 0) {
                break;
            } else if (num > 0) {
                PositiveNumber++;
            } else {
                NegativeNumber++;
            }
            count++;
        }
        System.out.println("您输入的正数有：" + PositiveNumber + "个,负数有:" + NegativeNumber + "个");
    }
}
