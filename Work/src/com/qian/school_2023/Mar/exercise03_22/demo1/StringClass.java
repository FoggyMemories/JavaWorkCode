package com.qian.school_2023.Mar.exercise03_22.demo1;

public class StringClass {
    public static void main(String[] args) {
        String name1 = "花花";
        String name2 = name1;
        String name3 = new String();
        System.out.println("name1=" + name1 + ",name2=" + name2 + ",name3=" + name3);
        String name4 = new String(name1);
        char[] ch1 = {'h', 'e', 'l', 'l', 'o', ',', 'l', 'i', 'd', 'a'};
        String name5 = new String(ch1);
        System.out.println("name5=" + name5 + ",它的长度是=" + name5.length());
        //区分大小写比较字符串是否相等，相等为true，不等false
        System.out.println("字符串相等吗:" + name5.equals("heLLO,LIDA"));
        System.out.println("字符串相等吗:" + name5.equalsIgnoreCase("heLLO,LIDA"));
        System.out.println("name5比较hello:" + name5.compareTo("hello"));
        System.out.println("name5比较hello:" + name5.compareToIgnoreCase("HELLO"));
    }
}
