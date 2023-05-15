package com.qian.school_2023.Mar.exercise03_29.demo;

public class StringClass4 {
    public static void main(String[] args) {
        String s1 = "Hello,World,123456789!";
        boolean b1 = s1.startsWith("hello");
        if(b1){
            System.out.println("该字符串是以hello字符串开始");
        }else {
            System.out.println("该字符串不是以hello字符串开始");

        }
    }
}
