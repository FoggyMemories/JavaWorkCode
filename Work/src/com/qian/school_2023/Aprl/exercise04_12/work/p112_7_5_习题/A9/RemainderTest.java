package com.qian.school_2023.Aprl.exercise04_12.work.p112_7_5_习题.A9;

import java.util.Scanner;

public class RemainderTest {
    public static void main(String[] args) {
        /*
        定义一个方法:包含两个参数(a,b),要求参数从命令行获得.求a%b的值.
         */

        //1.通过键盘录入两个参数
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个参数:");
        int a = sc.nextInt();
        System.out.println("输入第二个参数:");
        int b = sc.nextInt();
        System.out.println(remainderNumber(a, b));
    }

    private static int remainderNumber(int a, int b) {
        return a % b;
    }
}
