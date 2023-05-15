package com.qian.school_2022.Oct.exercise10_19.test;

import java.util.Scanner;

public class HomeWork2_2 {
    public static void main(String[] args) {
        double pi = 3.1415926;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个圆柱的半径：");
        double r = sc.nextDouble();

        System.out.println("请输入一个圆柱的高：");
        double h = sc.nextDouble();

        double area = Math.pow(r, 2) * pi;
        double volume = area * h;

        System.out.println("当 r = " + r + ",h = " + h + "时,\nv = " + volume + '!');
        System.out.println("这个圆柱的面积为：" + area);
        System.out.println("这个圆柱的体积为：" + volume);

    }
}
