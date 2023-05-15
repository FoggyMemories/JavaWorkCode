package com.qian.school_2022.Novm.exercise11_09.work;

import java.util.Scanner;

public class p52_4_9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int y = liftInt(x);
        int z = rightInt(x);
        System.out.println("这个浮点数的左取整数是：" + y);
        System.out.println("这个浮点数的右取整数是：" + z);



    }
    //定义一个方法表示double类型数值向左取整。
    public static int liftInt(double x){
        int i = (int)(x % 10);
        return i;
    }
    public static int rightInt(double x){
        int i = (int)(x % 10);
        i++;
        return i;
    }
}