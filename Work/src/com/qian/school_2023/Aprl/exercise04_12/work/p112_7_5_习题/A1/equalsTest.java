package com.qian.school_2023.Aprl.exercise04_12.work.p112_7_5_习题.A1;

import java.util.Scanner;

public class equalsTest {
    public static void main(String[] args) {
        /*
        提示用户输入两个字符串,并检验第一个字符串是否为第二个字符串的子串.
         */

        //1.键盘录入两个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个字符串:");
        String str1 = sc.nextLine();
        System.out.println("请输入第二个字符串:");
        String str2 = sc.nextLine();

        //2.进行两个字符串的判断
        if (str2.contains(str1)) {
            System.out.println("第一个字符串是第二个字符串的子串");
        } else {
            System.out.println("第一个字符串不是第二个字符串的子串");
        }
    }
}
