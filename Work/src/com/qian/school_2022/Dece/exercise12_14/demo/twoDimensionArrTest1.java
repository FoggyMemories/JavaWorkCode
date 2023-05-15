package com.qian.school_2022.Dece.exercise12_14.demo;

import java.util.Scanner;

public class twoDimensionArrTest1 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        input(arr);
        show(arr);
    }

    public static void input(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("请输入第" + (i + 1) + "行,第" + (j + 1) + "列的元素: ");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void show(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("arr[" + i + "]" + "[" + j + "]=" + arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
