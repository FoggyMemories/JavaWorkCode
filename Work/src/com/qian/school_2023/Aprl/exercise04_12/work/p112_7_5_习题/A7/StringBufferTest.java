package com.qian.school_2023.Aprl.exercise04_12.work.p112_7_5_习题.A7;

public class StringBufferTest {
    public static void main(String[] args) {
        /*
        定义一个方法,使用StringBuffer类中的reverse方法倒转字符串.
         */
        String str = "test1234";
        System.out.println(doReverse(str));
    }
    private static String doReverse(String str){
        StringBuffer sb = new StringBuffer();
        return sb.append(str).reverse().toString();
    }
}
