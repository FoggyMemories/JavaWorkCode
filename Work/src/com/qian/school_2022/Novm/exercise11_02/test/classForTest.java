package com.qian.school_2022.Novm.exercise11_02.test;

public class classForTest {
    public static void main(String[] args) {
        //for循环语句，广义的讲有4个语句
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1 ~ 100之间的所有数之和为：" + sum);

        int sumJi = 0;
        int sumOu = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sumJi += i;
            }
            if (i % 2 == 0) {
                sumOu += i;
            }
        }
        System.out.println("1 ~ 100之间的奇数之和为：" + sumJi);
        System.out.println("1 ~ 100之间的偶数之和为：" + sumOu);
    }
}
