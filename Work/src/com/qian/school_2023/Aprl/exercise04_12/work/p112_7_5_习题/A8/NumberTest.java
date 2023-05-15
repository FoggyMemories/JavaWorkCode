package com.qian.school_2023.Aprl.exercise04_12.work.p112_7_5_习题.A8;

public class NumberTest {
    public static void main(String[] args) {
        /*
        定义一个方法:检测一个字符串是否包含所有的数字值
         */

        String str = "asfaefgawr1as32dfg465asdg";
        System.out.println("是否含有数字:" + isNumber(str));

    }

    private static boolean isNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if (s.matches("\\d")) {
                return true;
            }
        }
        return false;
    }
}
