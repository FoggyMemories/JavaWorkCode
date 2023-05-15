package com.qian.school_2022.Novm.exercise11_09.work;

import java.util.Scanner;

public class p52_4_9_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        long num = sc.nextLong();
        long count = count(num);   //计算这个数字的长度
        System.out.println("这个数字的长度为:" + count);

        int a = sumDigits(count, num);
        System.out.println("这个数字各个位数的总和为:" + a);

    }
    public static int count(long x) {
        int count = 0;
        while (x != 0) {
            x = x / 10;
            count++;
        }
        return count;
    }

    public static int sumDigits(long x, long y) {
        int sum = 0;

        for (long i = 1; i <= x; i++) {
            sum += (y / Math.pow(10, i - 1)) % 10;
        }
        return sum;
    }
}
