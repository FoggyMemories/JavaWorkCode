package com.qian.school_2022.Oct.exercise10_26.test;

public class Operator {
    public static void main(String[] args) {
        //一元算数符 ：+ ，-，++，--
        //参与运算的变量只有一个
        int a = 10;
        int b = -a;
        System.out.println(a);
        System.out.println(b);
        a++;//a = a + 1;变量a自增
        b--;//b = b - 1;变量b自减

        System.out.println("a 自增 1 后 \n= " + a + "b 自减 1 后 \n= " + b);
    }
}
