package com.qian.school_2023.Mar.exercise03_29.work.p111;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入: this is a man");
        String s1 = sc.nextLine();
        StringTokenizer stk = new StringTokenizer(s1);
        System.out.println("字符串中包括" + stk.countTokens() + "个单词:");
        while (stk.hasMoreTokens()) {
            String str = stk.nextToken();
            System.out.println(str);
        }
    }
}
