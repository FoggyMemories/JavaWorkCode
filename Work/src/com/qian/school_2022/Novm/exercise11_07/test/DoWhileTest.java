package com.qian.school_2022.Novm.exercise11_07.test;

public class DoWhileTest {
    public static void main(String[] args) {
        int i = 1;
        int sum;
        int sumSingle = 0;
        int sumDouble = 0;
        do {
            if (i % 2 == 1) {
                sumSingle += i;
            } else {
                sumDouble += i;
            }
            i++;
        } while (i <= 100);
        sum = sumDouble + sumSingle;
        System.out.println("1 ~ 100之间\n总数为:" + sum + "\n奇数和为:" + sumSingle + "\n偶数和为:" + sumDouble);
    }
}
