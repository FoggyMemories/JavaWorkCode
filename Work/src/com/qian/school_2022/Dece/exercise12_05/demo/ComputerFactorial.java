package com.qian.school_2022.Dece.exercise12_05.demo;

import java.util.Scanner;

public class ComputerFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数:");
        int n = sc.nextInt();
        System.out.println("n的阶乘是:" + factorial(n));
    }

    public static long factorial(int n) {
        if (n == 0) return 1;
        else return n * factorial(n - 1);
    }
}
