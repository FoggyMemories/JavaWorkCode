package com.qian.school_2022.Dece.exercise12_05.work;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入斐波那契的索引值:");
        long n = sc.nextLong();
        System.out.println("斐波那契数列的索引" + n + " 对应的数据是:" + fib(n));
    }

    public static long fib(long n) {
        if ((n == 0) || (n == 1)) return 1;
        else return fib(n - 1) + fib(n - 2);
    }
}
