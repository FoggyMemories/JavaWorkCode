package com.qian.school_2022.Novm.exercise11_02.test;

public class p42_16 {
    public static void main(String[] args) {
        int count = 25;
        if (count % 8 == 0) {
            System.out.println(count + "能被八整除！\n");
        } else {
            System.out.println(count + "不能被八整除！");
        }
        //表达式1？表达式2：表达式3
        String result = count % 8 == 0 ? count + "能被八整除！\n" : count + "不能被八整除！\n";
        System.out.println("result = " + result);
    }
}
