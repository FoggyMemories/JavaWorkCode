package com.qian.school_2022.Oct.exercise10_26.test;

public class TernarOperations {
    public static void main(String[] args) {
        //条件运算符是三元运算符,也叫双目运算符.目的是之运算符号 ? :
        //条件表达式(逻辑值) ? 数据表达式1 : 数据表达式2 (各种数据类型)
        int a = 5, b = 2, result;
        String result1;
        if (a > b) {
            result = a - b;
        } else {
            result = b - a;
        }
        System.out.println("result = " + result);
        result = a > b ? a - b : b - a;
        System.out.println("result = " + result);
        result1 = a > b ? "a - b" : "b - a";
        System.out.println("result1 = " + result1);
    }
}
