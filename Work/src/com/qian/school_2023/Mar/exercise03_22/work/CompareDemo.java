package com.qian.school_2023.Mar.exercise03_22.work;

public class CompareDemo {
    public static void main(String[] args) {
        String s1 = "xyz";  //1.字符串字面常量
        String s2 = "xyz";  //2.字符串字面常量。与前一个字面常量相同
        String s3 = new String("xyz");
        String s4 = new String("xyz");
        System.out.println("s1==s2?" + (s1 == s2));     //关系运算符是比较两个数据值的大小
        System.out.println("s1==s3?" + (s1 == s3));
        System.out.println("s3==s4?" + (s3 == s4));
        System.out.println("s1.equals(s2)?:" + s1.equals(s2));  //equals是比较两个对象是否相等
        System.out.println("s1.equals(s3)?:" + s1.equals(s3));
        System.out.println("s3.equals(s4)?:" + s3.equals(s4));
        System.out.println("s1.equals(s3)?:" + s1.compareTo(s3));
    }
}
