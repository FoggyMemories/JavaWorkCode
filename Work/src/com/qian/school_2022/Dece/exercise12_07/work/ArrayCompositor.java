package com.qian.school_2022.Dece.exercise12_07.work;

import java.util.Scanner;

public class ArrayCompositor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个浮点数");
            arr[i] = sc.nextDouble();
        }
        System.out.println("正序：");
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "}");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }

        System.out.println();
        System.out.println("倒序：");
        System.out.print("{");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr[i] + "}");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
