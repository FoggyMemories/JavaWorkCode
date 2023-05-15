package com.qian.school_2022.Oct.exercise10_12.work;

import java.util.Scanner;

public class day2_2022_10_12_3_Work {
    public static void main(String[] args) {
        double pi = 3.1415926;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个圆柱的半径：");
        double r = sc.nextDouble();

        System.out.println("请输入一个圆柱的高：");
        double h = sc.nextDouble();

        double area = Math.pow(r,2) * pi;
        double volume = area * h;

        System.out.println("这个圆柱的面积为：" + area);
        System.out.println("这个圆柱的体积为：" + volume);

    }
}
