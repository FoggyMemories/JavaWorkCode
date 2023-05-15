package com.qian.school_2022.Novm.exercise11_02.test;
import java.util.ArrayList;
import java.util.Scanner;

public class P41_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int sum = 0;
        while (true) {
            System.out.println("请输入多个整数,如果输入的数为0时停止输入");
            int i = sc.nextInt();
            if (i != 0) {
                array.add(i);
            } else {
                break;
            }
            sum += i;
        }
        int avg = sum / array.size();
        System.out.println("输入的所有数字总和为：" + sum);
        System.out.println("输入的所有数字的平均数为：" + avg);
    }
}
