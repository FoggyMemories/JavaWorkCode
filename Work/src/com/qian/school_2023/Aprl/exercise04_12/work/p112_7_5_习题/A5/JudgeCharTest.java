package com.qian.school_2023.Aprl.exercise04_12.work.p112_7_5_习题.A5;

public class JudgeCharTest {
    public static void main(String[] args) {
        /*
        判断一个字符是字母还是数字,如果是字母则判断是大写还是小写
         */
        char ch = 'A';
        String str = String.valueOf(ch);
        if(str.matches("\\d")){
            System.out.println("该字符为数字");
        }else if(str.matches("\\p{Lower}")){
            System.out.println("该字符为小写字母");
        }else if(str.matches("\\p{Upper}")){
            System.out.println("该字符为大写字母");
        }
    }
}
