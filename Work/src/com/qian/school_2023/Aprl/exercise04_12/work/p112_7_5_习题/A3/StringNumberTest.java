package com.qian.school_2023.Aprl.exercise04_12.work.p112_7_5_习题.A3;

import java.util.StringTokenizer;

public class StringNumberTest {
    public static void main(String[] args) {
        /*
        定义方法:从输入的字符串中获取单词的数量与单词
         */
        System.out.println(StringLength("我,是清华大学毕业的,大专生!"));

    }
    private static int StringLength(String str){
        StringTokenizer st = new StringTokenizer(str);
        int count = 0;
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken(",!"));
            count++;
        }
        return count;
    }
}
