package com.qian.school_2022.Novm.exercise11_07.work;

import java.util.Scanner;

public class p41_3_6_10_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字n：");
        long n = sc.nextLong();
        long i = 1;
        long j = 1;
        long index = n * 3;
        while (j <= index){
            i *= j;
            j++;
        }
        System.out.println(i);
    }
}
