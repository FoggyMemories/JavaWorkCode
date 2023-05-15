package com.qian.school_2022.Novm.exercise11_16.test;

public class compare {
    public static void main(String[] args) {
        double num1 = 29.8,num2 = 98.2;
        double max = max(num1,num2);
        System.out.println("两个数比较大的数是:" + max);
    }
    public static double max  (double x,double y){
        if (x >= y) {
            return x;
        } else {
            return y;
        }
    }
}
