package com.qian.school_2023.Mar.exercise03_29.demo;

public class StringClass2 {
    public static void main(String[] args) {
        //获取字符串
        String s1 = "Hello,World,123456789!";
        String subs1 = s1.substring(12);
        System.out.println("subs1=" + subs1);//subs1=123456789!
        //包头不包尾
        String subs2 = s1.substring(12,21);
        System.out.println("subs2=" + subs2);//subs2=123456789

        int location = s1.indexOf("World");
        if(location == -1) {
            System.out.println("该字符串在字符串中不存在");
        }else {
            System.out.println("world字符串是从" + location + "号位置开始!");
        }
    }
}
