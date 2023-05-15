package com.qian.school_2023.Mar.exercise03_29.demo;

public class StringClass1 {

    public static void main(String[] args) {
        String s1 = "Hello,World";
        char char1 = s1.charAt(5);
        System.out.println("s1字符串的第五位索引字符是:" + char1);


        //将字符串转换为字符数组
        String s2 = "Hello,World";
        char[] buf = new char[30];
        s2.getChars(6, 11, buf, 10);//包头不包尾
        System.out.println("字符数组buf是:");
        for (int i = 0; i < buf.length; i++) {
            System.out.print(buf[i]);
        }
        System.out.println();
        System.out.println("-------------------------");
        char[] ch2 = s1.toCharArray();
        for (int i = 0; i < ch2.length; i++) {
            System.out.print(ch2[i]);
        }
        System.out.println();
        System.out.println("--------------");
        String[] s3 = s1.split(",");    //以","为规则进行分割
        for (int i = 0; i < s3.length; i++) {
            System.out.println("s3[" + i +"]=" + s3[i] + " ");
        }
    }
}
