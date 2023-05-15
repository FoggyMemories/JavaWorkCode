package com.qian.school_2022.Dece.exercise12_07.demo;

import java.util.Scanner;

public class InitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] a = new float[4];
        for (int i = 0; i < a.length; i++) {
            System.out.println("请键盘输入第" + (i + 1) + "个浮点数:");
            a[i] = sc.nextFloat();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
