package com.qian.school_2022.Novm.exercise11_16.work;

import java.util.Scanner;

public class p52_4_9_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入5个数字");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        files();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] +"\t\t" + sqrt(arr[i]));
        }

    }
    public static String sqrt(int number){
        double decimals = Math.sqrt(number);
        String sqrt = String.format("%.4f", decimals);

        return sqrt;
    }
    public static void files(){
        System.out.println("Number\tSquareRoot");
        System.out.println("...................");
    }
}
