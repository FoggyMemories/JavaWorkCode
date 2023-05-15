package com.qian.school_2022.Novm.exercise11_02.work;

public class p41_3_6_2 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 20; i++) {
            double fraction;
            double index = 1;
            for (int j = 1; j <= i; j++) {
                fraction = 1 / (j * 1.0);
                index = index * fraction;
            }
            sum += index;
        }
        System.out.println(sum);
    }
}
