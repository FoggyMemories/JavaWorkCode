package com.qian.school_2022.Oct.exercise10_26.test;

public class LogicTest {
    public static void main(String[] args) {
        //逻辑运算符 & 与运算:全 true 出 true
        boolean b1 = true, b2 = true, b3 = false, b4 = false;
        boolean result1, result2, result3, result4;
        result1 = b1 & b2;//true
        result2 = b1 & b3;//false
        result3 = b3 & b1;//false
        result4 = b4 & b3;//false
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        //逻辑运算符|,或运算,有true出true;
        System.out.println();
        boolean re1, re2, re3, re4;
        re1 = b1 | b2;//true
        re2 = b1 | b2;//true
        re3 = b3 | b1;//true
        re4 = b4 | b3;//false
        System.out.println(re1);
        System.out.println(re2);
        System.out.println(re3);
        System.out.println(re4);
        //逻辑运算符!,非运算,取反
        System.out.println();
        boolean bb1,bb2;
        bb1 = ! b1;
        bb2 = ! b2;
        System.out.println(bb1);
        System.out.println(bb2);
        //逻辑运算符:&&,短路与,符合&运算规则,&&两边的表达式地位不同
        //左边权大,如果左边为false,则直接输出false
        System.out.println();
        boolean b11 = b3 && b1;//直接false
        System.out.println(b11);
        //逻辑运算符:||,短路或,符合|运算规则,||两边的表达式地位不同
        //左边权大,如果左边为true,则直接输出true.
        System.out.println();
        boolean b22 = b1 || b4;
        System.out.println(b22);

    }
}
