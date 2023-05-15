package com.qian.school_2023.Mar.exercise03_29.work.p110;

public class BufferModified {
    public static void main(String[] args) {
        char[] ch = {'a', 'b', 'c', 'd', 'e'};
        StringBuffer sb = new StringBuffer("12345");
        sb.append("ABCDE");
        sb.insert(0, ch);
        System.out.println("增加字符串后,sb包含的字符串为:" + sb);
        sb.replace(5, 10, "00000");
        System.out.println("替换字符串后,sb包含的字符串为:" + sb);
        sb.delete(5, 10);
        System.out.println("删除字符串后,sb包含的字符串为:" + sb);
        sb.reverse();
        System.out.println("逆序后,sb包含的字符串为:" + sb);
    }
}
