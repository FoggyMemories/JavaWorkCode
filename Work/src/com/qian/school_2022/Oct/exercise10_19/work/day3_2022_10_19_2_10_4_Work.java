package com.qian.school_2022.Oct.exercise10_19.work;

import java.util.Scanner;

public class day3_2022_10_19_2_10_4_Work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个double类型的数字：");
        double i = sc.nextDouble();

        if (i >= 1 && i <= 100) {
            System.out.println("The number " + i + " between 1 and 100 is true.");
        } else if(i >= 101 && i <= 1000){
            System.out.println("The number " + i + " between 1 and 1000 is false.");
        }
    }
}
