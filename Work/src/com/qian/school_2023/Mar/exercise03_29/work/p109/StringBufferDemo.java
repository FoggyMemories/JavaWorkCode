package com.qian.school_2023.Mar.exercise03_29.work.p109;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abcdefghijklmnopqrstuvwxyz");
        System.out.println("缓冲区中的字符串:" + sb.toString());
        System.out.println("sb.length()= " + sb.length());
        System.out.println("sb.capacity()= "+ sb.capacity());
        System.out.println("设置sb的新长度为10后");
        sb.setLength(10);
        System.out.println("字符串的内容为:" + sb.toString());
        System.out.println("sb.length()= " + sb.length());
        System.out.println("sb.capacity= " + sb.capacity());
    }
}
