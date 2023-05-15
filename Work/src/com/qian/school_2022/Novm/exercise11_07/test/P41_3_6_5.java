package com.qian.school_2022.Novm.exercise11_07.test;

import java.util.ArrayList;
import java.util.Scanner;

public class P41_3_6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int count = 0;
        int sum = 0;
        while (true) {
            System.out.println("请输入多个整数(输入为0时停止输入)");
            int i = sc.nextInt();
            if (i != 0) {
                array.add(i);
                count++;
            } else {
                break;
            }
            sum += i;
        }
        double avg = (sum * 1.0) / array.size();
        System.out.println("一共输入了" + count + "个数");
        System.out.println("输入的所有数字总和为：" + sum);
        System.out.println("输入的所有数字的平均数为：" + avg);
    }
}
