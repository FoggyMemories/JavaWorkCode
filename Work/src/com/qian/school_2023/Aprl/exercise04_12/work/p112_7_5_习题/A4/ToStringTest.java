package com.qian.school_2023.Aprl.exercise04_12.work.p112_7_5_习题.A4;
public class ToStringTest {
    public static void main(String[] args) {
        /*
        定义方法:将一个char值、一个char数组、一个数值转换为一个字符串
         */
        char[] ch = {'a', 'b', 'c'};
        System.out.println(toString('c', ch, 2));

    }

    private static String toString(char c, char[] arrChar, int number) {
        StringBuilder sb = new StringBuilder();
        //将char类型的加入List集合
        sb.append(c);

        //将char[]类型的加入List集合
        String str1 = String.valueOf(arrChar);
        sb.append(str1);

        //将int类型的加入List集合
        String str2 = String.valueOf(number);
        sb.append(str2);

        //返回List集合
        return sb.toString();
    }
}
