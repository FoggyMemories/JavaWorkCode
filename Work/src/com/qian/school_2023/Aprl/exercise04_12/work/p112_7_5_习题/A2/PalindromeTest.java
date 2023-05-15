package com.qian.school_2023.Aprl.exercise04_12.work.p112_7_5_习题.A2;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {
        /*
        从命令行参数读取一个字符串并检验它是否为回文
         */

        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.nextLine();

        //2.创建一个StringBuilder对象
        StringBuilder sb = new StringBuilder(str);
        String str2 = sb.reverse().toString();

        //3.进行回文判断
        if (str.equals(str2)) {
            System.out.println("输入的字符串为回文");
        } else {
            System.out.println("输入的字符串不为回文");
        }
    }
}
