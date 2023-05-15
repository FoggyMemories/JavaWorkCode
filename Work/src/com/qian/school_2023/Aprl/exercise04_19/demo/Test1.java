package com.qian.school_2023.Aprl.exercise04_19.demo;

public class Test1 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (judge(args[i])) {
                System.out.println("该字符串是回文。");
            } else {
                System.out.println("该字符串不是回文。");
            }
        }

    }

    private static boolean judge(String str) {
        StringBuilder sb = new StringBuilder();
        String str1 = sb.append(str).reverse().toString();
        return str1.equals(str);
    }
}
