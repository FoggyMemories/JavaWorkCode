package com.qian.school_2022.Novm.exercise11_07.test;

import java.util.Scanner;

public class p41_3_6_3 {
    public static void main(String[] args) {
        Scanner lr = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入一个整数");
            switch (i) {
                case 0:
                    a = lr.nextInt();
                    break;
                case 1:
                    b = lr.nextInt();
                    break;
                case 2:
                    c = lr.nextInt();
                    break;
            }
        }
        int exchange = 0, exchange1 = 0;
        if (a > b) {
            exchange = a;
            a = b;
            b = exchange;
            if (c > a) {
                exchange1 = c;
                c = a;
                a = exchange1;
            }
        }
        if (b > c) {
            exchange = c;
            c = b;
            b = exchange;
            if (b < a) {
                exchange1 = b;
                b = a;
                a = exchange1;
            }
        }

        System.out.println("三个数从小到大排序是：" + a + "," + b + "," + c);
    }
}
