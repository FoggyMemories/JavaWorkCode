package com.qian.school_2022.Novm.exercise11_02.work;

import java.util.Scanner;

public class p41_3_6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个整数");
        int[] arr = new int[3];
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入第" + i + "个整数");
            arr[i - 1] = sc.nextInt();
        }

        if (arr[0] >= arr[1] && arr[0] >= arr[2]) {
            if (arr[1] >= arr[2]) {
                System.out.println("num1>=num2>=num3");
            } else if (arr[1] <= arr[2]) {
                System.out.println("num1>=num3>=num2");
            }
        }

        if (arr[1] >= arr[0] && arr[1] >= arr[2]) {
            if (arr[0] >= arr[2]) {
                System.out.println("num2>=num1>=num3");
            } else if (arr[0] <= arr[2]) {
                System.out.println("num2>=num3>=num1");
            }
        }

        if (arr[2] >= arr[1] && arr[2] >= arr[0]) {
            if (arr[1] >= arr[0]) {
                System.out.println("num3>=num2>=num1");
            } else if (arr[1] <= arr[0]) {
                System.out.println("num3>=num1>=num2");
            }
        }
    }
}
