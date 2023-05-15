package com.qian.school_2022.Dece.exercise12_07.demo;

public class PrintArray {
    public static void main(String[] args) {
        float[] f1 = {1.0f, 2.3f, 3.6f};   //每个float型数据都要加f
        for (float xyz : f1         //xyz变量在f1数组中里面是通称
        ) {
            System.out.println(xyz);
        }
        for (int i = f1.length - 1; i >= 0; i--) {
            System.out.print(f1[i] + " ");
        }
    }
}
