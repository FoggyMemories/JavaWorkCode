package com.qian.school_2023.Mar.exercise03_29.demo;

public class StringClass3 {
    public static void main(String[] args) {
        String s1 = "Hello,World,123456789!";
        System.out.println("s1字符被替换后:" + s1.replace(',',':'));
        String s11 = s1.toLowerCase();
        System.out.println("s11=" + s11);
    }
}
