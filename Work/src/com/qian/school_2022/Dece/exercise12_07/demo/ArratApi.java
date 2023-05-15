package com.qian.school_2022.Dece.exercise12_07.demo;

import java.util.Random;

public class ArratApi {
    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
        }
        int max, min, sum = 0;
        float average;
        max = min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        }
        average = sum / 10.0f;
        System.out.println("数组元素:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n最大值:" + max + "\t最小值:" + min);
        System.out.println("平均值:" + average);
    }
}
