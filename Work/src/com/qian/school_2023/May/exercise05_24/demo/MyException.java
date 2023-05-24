package com.qian.school_2023.May.exercise05_24.demo;

import java.util.Scanner;

public class MyException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的分数:");
        int score = sc.nextInt();
        try {
            check(score);
        } catch (WoException e) {
            e.printStackTrace();
        }
    }

    public static void check(double d) throws WoException {
        if (d > 100 || d < 0) throw new WoException("您的成绩不对劲,要求是0 ~ 100之间");
        else {
            System.out.println("您的分数是: " + d);
        }
    }
}

//自定义异常一定是把系统的某个异常进行继承
class WoException extends Exception {
    public WoException() {
    }

    public WoException(String s) {
        super(s);
    }
}
