package com.qian.school_2022.Novm.exercise11_07.work;

import java.util.Scanner;

public class p41_3_6_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字n");
        int n = sc.nextInt();
        boolean x = test(n);
        if(x){
            System.out.println("输入的数字大于100");
        }
        skin7(n);
    }

    public static boolean test(int n) {
        if(n <= 100){
            return false;
        }
        return true;
    }
    public static void skin7(int n){
        for (int i = 1; i <= n; i++) {
            if (i % 7 == 0 || i / 10 % 10 == 7 || i % 10 == 7) {
                System.out.println("过");
                continue;
            } else if (n > 100) {
                break;
            }
            System.out.println(i);
        }
    }
}
